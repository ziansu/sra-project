public void run() {
    try {
        cards.show(cardPanel, "Trans");
        digCar.setCarStopped(false);
        java.lang.Thread.sleep(5000);
        fdc.diagnoseFully();
        digCar.setCarStopped(true);
        cards.show(cardPanel, "Full Diagnose");
    } catch (java.lang.InterruptedException ex) {
    }
}