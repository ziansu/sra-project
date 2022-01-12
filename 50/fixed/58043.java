private void handOff(com.conveyal.osmlib.VEXBlock vexBlock) {
    try {
        synchronousQueue.put(vexBlock);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}