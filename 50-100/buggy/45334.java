@org.junit.Test
public void latestLogFileContainingACheckPointOnly() throws java.lang.Throwable {
    org.neo4j.kernel.recovery.LatestCheckPointFinder finder = new org.neo4j.kernel.recovery.LatestCheckPointFinder(logFiles, fs, reader);
    org.neo4j.kernel.impl.transaction.log.entry.CheckPoint checkPoint = new org.neo4j.kernel.impl.transaction.log.entry.CheckPoint(new org.neo4j.kernel.impl.transaction.log.LogPosition(logVersion, 33));
    org.mockito.Mockito.when(reader.readLogEntry(org.mockito.Matchers.any(org.neo4j.kernel.impl.transaction.log.ReadableVersionableLogChannel.class))).thenReturn(checkPoint, null);
    org.neo4j.kernel.recovery.LatestCheckPointFinder.LatestCheckPoint latestCheckPoint = finder.find(logVersion);
    org.junit.Assert.assertEquals(new org.neo4j.kernel.recovery.LatestCheckPointFinder.LatestCheckPoint(checkPoint, false, olderLogVersion), latestCheckPoint);
}