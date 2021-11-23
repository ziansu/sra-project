@java.lang.Override
public boolean getBit(int index) throws java.lang.IndexOutOfBoundsException {
    if ((index < 0) || (index > 7))
        throw new java.lang.IndexOutOfBoundsException("Index of out of range (getBit()).");
    
    return (((this.getValue()) & (1 << index)) >> index) == 1;
}