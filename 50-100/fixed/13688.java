protected void setupJavaFX() throws java.lang.InterruptedException {
    long timeMillis = java.lang.System.currentTimeMillis();
    final java.util.concurrent.CountDownLatch latch = new java.util.concurrent.CountDownLatch(1);
    javax.swing.SwingUtilities.invokeLater(new java.lang.Runnable() {
        public void run() {
            new javafx.embed.swing.JFXPanel();
            latch.countDown();
        }
    });
    java.lang.System.out.println("javafx initialising...");
    latch.await();
    java.lang.System.out.println((("javafx is initialised in " + ((java.lang.System.currentTimeMillis()) - timeMillis)) + "ms"));
}