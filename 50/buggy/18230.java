public void setTime(java.lang.String hms) {
    if ((hms.length()) == 8) {
        theTimer.stop();
        theTimer.setTime(hms);
        theTimer.start();
    }
}