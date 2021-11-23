public void setup(java.util.concurrent.Semaphore inputSemaphore) {
    endSemaphore = new java.util.concurrent.Semaphore((-(Sorters.size())), true);
    this.inputSemaphore = inputSemaphore;
    for (core.Sorter sorter : Sorters) {
        sorter.setup(endSemaphore);
    }
    this.start();
}