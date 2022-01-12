public void waitForNewThread(java.util.Set<java.lang.Thread> threadsBefore) {
    java.util.Set<java.lang.Thread> mafter = java.lang.Thread.getAllStackTraces().keySet();
    for (java.lang.Thread t1 : mafter) {
        if (!(threadsBefore.contains(t1))) {
            while (t1.isAlive());
        }
    }
}