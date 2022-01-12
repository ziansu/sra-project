public <T> boolean checkBounds(T[] values) {
    if (values == null)
        return false;
    
    return ((this.start) >= 0) && ((this.end) <= (values.length));
}