public void rumbleTime(double mag, double milis) {
    setRumble(RumbleType.kLeftRumble, mag);
    setRumble(RumbleType.kRightRumble, mag);
    try {
        java.lang.Thread.sleep(((long) (milis)));
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
        java.lang.Thread.sleep(30000);
    }
    setRumble(RumbleType.kLeftRumble, 0);
    setRumble(RumbleType.kRightRumble, 0);
}