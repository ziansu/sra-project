public void autoDrive(double speed, double turnRate, long time) {
    long clock = java.lang.System.currentTimeMillis();
    long duration = (java.lang.System.currentTimeMillis()) + (java.lang.Long.valueOf(8000));
    log.send((("Automatic drive sequence started for " + time) + " milliseconds."));
    while (clock < duration) {
        arcadeDrive.drive(speed, turnRate);
        clock = java.lang.System.currentTimeMillis();
    } 
    log.send("Automatic drive sequence time expired.");
}