public void run() {
    int timeLeft = ((int) ((money) * 4));
    int seconds = timeLeft * 60;
    for (int i = seconds; i > 0; i--) {
        try {
            java.lang.Thread.sleep(1000);
        } catch (java.lang.InterruptedException ex) {
        }
    }
    java.lang.System.out.println(((("\nCustomer " + (name)) + " has finished their service at ") + (getTime())));
}