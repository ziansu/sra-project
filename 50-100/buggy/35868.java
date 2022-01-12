private boolean calcFinalTime() {
    boolean valid = calcTimeMoved();
    if (valid == true) {
        if ((initTime) != (java.lang.Double.NaN))
            finalTime = (timeMoved) + (initTime);
        else
            finalTime = timeMoved;
        
    }
    if (!(java.lang.Double.isNaN(finalTime))) {
        return true;
    }
    return valid;
}