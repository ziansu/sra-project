private void stopStream() {
    java.lang.System.out.println("Stopping stream");
    if ((cs) == null) {
        return ;
    }
    cs.stopStream();
    cs = null;
    try {
        t.join();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}