public boolean isUpdating(long time) {
    boolean res = ((getDelay()) <= time) && ((!(lastUpdate)) || (((getDelay()) + (getDuration())) >= time));
    if (done)
        lastUpdate = true;
    
    return res;
}