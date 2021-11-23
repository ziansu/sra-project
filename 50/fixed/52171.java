private void stopPokeScan() {
    try {
        mapObjectsLoader.interrupt();
        mapObjectsLoader.join();
        showProgressbar(false);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}