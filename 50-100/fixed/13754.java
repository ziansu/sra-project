void rollback() {
    mockedToMockupInstances.entrySet().retainAll(previousMockInstances.entrySet());
    for (java.util.Map.Entry<java.lang.Class<?>, java.lang.Integer> mockUpClassAndCount : previousMockUpClassesAndMockupCounts.entrySet()) {
        java.lang.Class<?> mockUpClass = mockUpClassAndCount.getKey();
        mockit.internal.state.MockClasses.MockUpInstances mockUpData = mockupClassesToMockupInstances.get(mockUpClass);
        mockUpData.numberOfMockupsForSingleInstance = mockUpClassAndCount.getValue();
    }
    mockupClassesToMockupInstances.keySet().retainAll(previousMockUpClassesAndMockupCounts.keySet());
}