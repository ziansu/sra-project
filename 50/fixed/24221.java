public void persist() throws java.io.IOException {
    synchronized(refreshLock) {
        ramWriter.commit();
        persistWriter.addIndexes(ramDir);
        persistWriter.commit();
        reset();
    }
}