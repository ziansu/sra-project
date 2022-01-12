@org.junit.Test
public void testDeleteSnapshot_Operation() {
    org.easymock.EasyMock.expect(computeRpcMock.deleteSnapshot(com.google.gcloud.compute.ComputeImplTest.SNAPSHOT_ID.snapshot(), com.google.gcloud.compute.ComputeImplTest.EMPTY_RPC_OPTIONS)).andReturn(globalOperation.toPb());
    org.easymock.EasyMock.replay(computeRpcMock);
    compute = options.service();
    org.junit.Assert.assertEquals(globalOperation, compute.deleteSnapshot(com.google.gcloud.compute.ComputeImplTest.SNAPSHOT_ID.snapshot()));
}