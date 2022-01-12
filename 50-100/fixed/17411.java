public void activateRegistrationMode() {
    model.Alarmsystem.getInstance().registrationMode = true;
    new java.lang.Thread(() -> {
        try {
            java.lang.Thread.sleep(60000);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        } finally {
            model.Alarmsystem.getInstance().registrationMode = false;
        }
    }).start();
}