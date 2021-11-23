public long addSeconds(long seconds) {
    if (seconds == 0)
        return 0;
    else
        if (seconds > 0)
            return this.add(seconds);
        else
            return this.subtract(seconds);
        
    
}