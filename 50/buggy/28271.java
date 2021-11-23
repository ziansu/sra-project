public void load() {
    worldBuilder.loadWorld();
    try {
        wait();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}