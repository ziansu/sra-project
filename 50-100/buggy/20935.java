public boolean shouldRing() {
    java.lang.String currentTime = this.time.getTime();
    java.lang.System.out.println(time.getTime());
    if (timesToRing.isEmpty()) {
        throw new java.lang.RuntimeException("No alarms set");
    }
    for (pl.edu.pjatk.tau.lab4.Time time : timesToRing) {
        if (time.getTime().equals(currentTime)) {
            if ((previousRing) != currentTime) {
                previousRing = currentTime;
                return true;
            }else {
                continue;
            }
        }
    }
    previousRing = null;
    return false;
}