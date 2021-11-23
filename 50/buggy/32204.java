public int peek() {
    if ((open) != (close))
        throw new java.lang.ArrayIndexOutOfBoundsException();
    
    return values[open];
}