void rollback() {
    mockedToMockupInstances.keySet().retainAll(previousMockInstances);
    for (java.util.Map.Entry<java.lang.Class<?>, java.lang.Integer> mockUpClassAndCount : previousMockUpClassesAndMockupCounts.entrySet()) {
        java.lang.Class<?> mockUpClass = mockUpClassAndCount.getKey();
        mockit.internal.state.MockClasses.MockUpInstances mockUpData = mockupClassesToMockupInstances.get(mockUpClass);
        mockUpData.numberOfMockupsForSingleInstance = mockUpClassAndCount.getValue();
    }
    mockupClassesToMockupInstances.keySet().retainAll(previousMockUpClassesAndMockupCounts.keySet());
}