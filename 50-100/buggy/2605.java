public void run() {
    try {
        cards.show(cardPanel, "Trans");
        digCar.setCarStopped(false);
        digCar.start();
        java.lang.Thread.sleep(5000);
        fdc.diagnoseFully();
        digCar.stop();
        cards.show(cardPanel, "Full Diagnose");
    } catch (java.lang.InterruptedException ex) {
    }
}