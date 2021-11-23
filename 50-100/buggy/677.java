private org.apache.apex.malhar.lib.window.impl.WindowedOperatorImpl<java.lang.Long, java.lang.Long, java.lang.Long> createDefaultWindowedOperator() {
    org.apache.apex.malhar.lib.window.impl.WindowedOperatorImpl<java.lang.Long, java.lang.Long, java.lang.Long> windowedOperator = new org.apache.apex.malhar.lib.window.impl.WindowedOperatorImpl();
    windowedOperator.setDataStorage(new org.apache.apex.malhar.lib.window.impl.InMemoryWindowedStorage<java.lang.Long>());
    windowedOperator.setRetractionStorage(new org.apache.apex.malhar.lib.window.impl.InMemoryWindowedStorage<java.lang.Long>());
    windowedOperator.setWindowStateStorage(new org.apache.apex.malhar.lib.window.impl.InMemoryWindowedStorage<org.apache.apex.malhar.lib.window.WindowState>());
    windowedOperator.setDataStorage(new org.apache.apex.malhar.lib.window.impl.InMemoryWindowedStorage<java.lang.Long>());
    windowedOperator.setAccumulation(new org.apache.apex.malhar.lib.window.SumAccumulation());
    return windowedOperator;
}