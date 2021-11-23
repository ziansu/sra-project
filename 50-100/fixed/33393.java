public void run() {
    try {
        while (((accelerateClock.now()) - (initTime)) < (testDuration)) {
            java.lang.String dateInStringWithMs = dateFormatWithMs.format(new java.util.Date(accelerateClock.now()));
            debug.message(("Fake date = " + dateInStringWithMs), null);
        } 
    } catch (java.lang.Exception e) {
        this.ex = e;
    }
}