protected void addDefaultLoader() {
    synchronized(loaders) {
        loaders.add(systemLoader);
        loaders.add(parentLoader);
        loaders.add(currentLoader);
        loaders.add(threadLoader);
        java.util.Collections.sort(loaders);
    }
}