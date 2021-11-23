protected void freeze(int ms) {
    try {
        synchronized(this) {
            wait(ms);
        }
    } catch (java.lang.InterruptedException ex) {
        java.lang.System.out.println(ex);
    }
}