public int getDimension() {
    if ((length) == 0)
        throw new java.lang.RuntimeException("Zero-dimensional parameter!");
    
    return length;
}