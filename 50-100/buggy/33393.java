public void run() {
    try {
        while (((java.lang.System.currentTimeMillis()) - (initTime)) < (testDuration)) {
            java.lang.String dateInStringWithMs = dateFormatWithMs.format(new java.util.Date(accelerateClock.now()));
            debug.message(("Fake date = " + dateInStringWithMs), null);
        } 
    } catch (java.lang.Exception e) {
        this.ex = e;
    }
}