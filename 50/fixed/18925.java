public int getMaxDistance() {
    if ((maxDistance) == 0) {
        return DEFAULT_MAX_DISTANCE;
    }else
        if ((maxDistance) < 0) {
            return 1000000000;
        }else {
            return maxDistance;
        }
    
}