private boolean calcInitTime() {
    boolean valid = calcTimeMoved();
    if (valid == true) {
        if ((finalTime) != (java.lang.Double.NaN))
            initTime = (finalTime) - (timeMoved);
        else
            initTime = timeMoved;
        
    }
    if (!(java.lang.Double.isNaN(initTime))) {
        return true;
    }
    return valid;
}