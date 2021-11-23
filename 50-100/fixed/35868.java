private boolean calcFinalTime() {
    boolean valid = calcTimeMoved();
    if (valid) {
        if (!(java.lang.Double.isNaN(initTime)))
            finalTime = (timeMoved) + (initTime);
        else
            finalTime = timeMoved;
        
    }
    if (!(java.lang.Double.isNaN(finalTime))) {
        return true;
    }
    return valid;
}