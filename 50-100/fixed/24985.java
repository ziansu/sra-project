private void run() throws java.lang.InterruptedException {
    boolean dataFound = false;
    while (!(closed)) {
        shouldFetch = true;
        while (shouldFetch) {
            shouldFetch = false;
            dataFound = fetchData();
        } 
        if (!dataFound) {
            waitForData();
        }
    } 
}