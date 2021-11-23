private boolean isEven(int i) {
    try {
        java.lang.Thread.sleep(1000);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    return (i % 2) == 0;
}