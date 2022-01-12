private int discretize(float value, float[] cp) {
    if (cp == null)
        return 0;
    
    int ipoint = java.util.Arrays.binarySearch(cp, value);
    if (ipoint != (-1))
        return ipoint;
    else
        return 0;
    
}