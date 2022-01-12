protected boolean isTimeToChange(long currentTime) {
    if ((!(changed)) && (currentTime >= (changeTime))) {
        changed = true;
        return true;
    }
    return false;
}