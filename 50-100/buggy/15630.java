public void shake(se.alexanderkarlsson.beerchug.utilities.ShakeDirection shakeDirection) {
    if (((!(chugStarted())) || ((lastShake) == shakeDirection)) || (!(firstShakeDone))) {
        squirted = true;
    }else
        if (!(squirted)) {
            lastShake = shakeDirection;
            (centilitersRemaining)--;
        }
    
}