public void activateRegistrationMode() {
    new java.lang.Thread(() -> {
        model.Alarmsystem.getInstance().registrationMode = true;
        try {
            java.lang.Thread.sleep(60000);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        } finally {
            model.Alarmsystem.getInstance().registrationMode = false;
        }
    }).start();
}