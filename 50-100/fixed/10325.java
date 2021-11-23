private boolean calcInitTime() {
    boolean valid = calcTimeMoved();
    if (valid) {
        if (!(java.lang.Double.isNaN(finalTime)))
            initTime = (finalTime) - (timeMoved);
        else
            initTime = 0;
        
    }
    if (!(java.lang.Double.isNaN(initTime))) {
        return true;
    }
    return valid;
}