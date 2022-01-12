@org.junit.Test
public void oneCheckointedLineageTest() {
    mLineageStore.createLineage(com.google.common.collect.Lists.<tachyon.client.file.TachyonFile>newArrayList(), com.google.common.collect.Lists.newArrayList(new tachyon.master.lineage.meta.LineageFile(1)), mJob);
    mLineageStore.completeFile(1);
    mLineageStore.commitFilePersistence(1L);
    org.mockito.Mockito.when(mFileSystemMaster.getLostFiles()).thenReturn(com.google.common.collect.Lists.newArrayList(1L));
    tachyon.master.lineage.recompute.RecomputePlan plan = mPlanner.plan();
    org.junit.Assert.assertEquals(0, plan.getLineageToRecompute().size());
}