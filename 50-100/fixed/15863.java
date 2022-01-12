public void set(int[] bitIdx) {
    if ((bitIdx.length) == 0)
        return ;
    
    java.util.Arrays.sort(bitIdx);
    int maxValue = bitIdx[((bitIdx.length) - 1)];
    int minValue = bitIdx[0];
    if ((maxValue > (mSize)) || (minValue < (mMinSize))) {
        throw new java.lang.IndexOutOfBoundsException();
    }
    for (int b : bitIdx) {
        this.set(b);
    }
}