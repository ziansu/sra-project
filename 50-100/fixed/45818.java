public void shake(se.alexanderkarlsson.beerchug.utilities.ShakeDirection shakeDirection) {
    if (((!(chugStarted())) || ((lastShake) == shakeDirection)) || (!(firstShakeDone))) {
        squirted = true;
    }else
        if ((!(squirted)) && ((centilitersRemaining) != 0)) {
            (centilitersRemaining)--;
        }
    
    lastShake = shakeDirection;
}