@java.lang.Override
public void run() {
    try {
        Config.dedup.hash();
    } catch (java.lang.Exception e) {
        boundaryQueue.add(null);
    }
}