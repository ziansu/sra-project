public void run() {
    try {
        java.lang.Thread.sleep(1450);
    } catch (java.lang.InterruptedException e1) {
        e1.printStackTrace();
    }
    while (mainmain.m.pw.ongoing) {
        try {
            updateDrag();
            try {
                java.lang.Thread.sleep(1500);
            } catch (java.lang.InterruptedException e) {
            }
        } catch (java.lang.NullPointerException e) {
        }
    } 
}