public boolean insertTokenInBuffer(comp.app.Token t) {
    boolean inserted = false;
    int tries = 0;
    inserted = mTokenBuffer.offer(t);
    if (!inserted) {
        while ((!inserted) && (tries < 3)) {
            try {
                java.lang.Thread.sleep(10);
            } catch (java.lang.InterruptedException e) {
            }
            inserted = mTokenBuffer.offer(t);
        } 
    }
    return inserted;
}