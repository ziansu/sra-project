public void setAdapter(java.lang.Class<?> adapterType, java.lang.Object adapter) {
    synchronized(adapters) {
        assert adapterType.isInstance(adapter);
        adapters.put(adapterType, adapter);
    }
}