public synchronized int getValue() {
    if (isOutdated())
        reloadSize();
    
    return value;
}