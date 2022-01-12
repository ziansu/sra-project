public boolean isUpdating(long time) {
    boolean res = (((getDelay()) <= time) && ((!(lastUpdate)) || (((getDelay()) + (getDuration())) >= time))) || (!(init));
    if (init)
        init = true;
    
    if (done)
        lastUpdate = true;
    
    return res;
}