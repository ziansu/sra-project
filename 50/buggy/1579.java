public int addToRemainingTime(int change) {
    if ((remainingTime) >= change)
        this.remainingTime += change;
    
    return remainingTime;
}