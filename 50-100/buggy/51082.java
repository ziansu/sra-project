public int length() {
    if (isEmpty())
        return 0;
    
    if ((len) > 0)
        return len;
    
    int len = (getLast().rightMost()) - (getFirst().leftMost());
    if ((circle) != null)
        len = java.lang.Math.abs(circle.getMagnitute());
    
    return len;
}