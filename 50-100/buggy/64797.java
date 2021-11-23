private void delay() {
    if ((delay) != 0) {
        diagram.redraw();
        try {
            java.lang.Thread.sleep(delay);
        } catch (java.lang.InterruptedException e) {
            java.lang.System.out.println(e.getMessage());
        }
    }
    waitForNext();
}