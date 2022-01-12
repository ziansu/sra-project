private void run() throws java.lang.InterruptedException {
    boolean dataFound = false;
    while (!(closed)) {
        shouldFetch = true;
        while (shouldFetch) {
            shouldFetch = false;
            dataFound = fetchData();
        } 
        if (tailingConsumers.isEmpty()) {
            newest = null;
        }
        if (!dataFound) {
            waitForData();
        }
    } 
}