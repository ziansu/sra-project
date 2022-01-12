private int[] getDim(int elements) {
    int xDim = ((int) (java.lang.Math.ceil(java.lang.Math.sqrt(elements))));
    int yDim = xDim;
    while ((xDim * (yDim - 1)) >= elements) {
        yDim--;
    } 
    return new int[]{ xDim , yDim };
}