@org.junit.Before
public void resetMocks() throws java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException {
    mockPool = org.easymock.EasyMock.createNiceMock(com.jolbox.bonecp.BoneCP.class);
    mockConnectionPartition = org.easymock.EasyMock.createNiceMock(com.jolbox.bonecp.ConnectionPartition.class);
    mockExecutor = org.easymock.EasyMock.createNiceMock(java.util.concurrent.ScheduledExecutorService.class);
    config = new com.jolbox.bonecp.BoneCPConfig();
    config.setMaxConnectionAgeInSeconds(1);
    testClass = new com.jolbox.bonecp.ConnectionMaxAgeThread(mockConnectionPartition, mockExecutor, mockPool, 5000, false);
    com.jolbox.bonecp.TestUtils.mockLogger(testClass.getClass());
}