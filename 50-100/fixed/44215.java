private int discretize(float value, java.lang.Float[] cp) {
    if (cp == null)
        return 0;
    
    int ipoint = java.util.Arrays.binarySearch(cp, value);
    if (ipoint < 0)
        return (java.lang.Math.abs(ipoint)) - 1;
    else
        return ipoint;
    
}