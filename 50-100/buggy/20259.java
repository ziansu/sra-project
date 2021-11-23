public boolean isFinished() {
    if (((throw1) != (NO_SCORE)) && ((throw2) != (NO_SCORE))) {
        if (((throw1) == 10) || (((throw1) + (throw2)) == 10)) {
            return (throw3) != (NO_SCORE);
        }
    }
    return false;
}