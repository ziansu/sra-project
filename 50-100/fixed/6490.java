private void up() {
    if ((c) == null) {
        try {
            throw new java.lang.Exception("Brak Postaci");
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
    for (int i = 0; i < (maxJumpHeigth); i++) {
        synchronized(c) {
            c.up();
        }
        try {
            java.lang.Thread.sleep(100);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    }
}