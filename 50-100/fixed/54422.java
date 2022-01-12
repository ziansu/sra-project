private int[] expandDimension(int U) {
    int i = (U / (this.N)) + 1;
    int j = (U - ((this.N) * (U / (this.N)))) + 1;
    int[] retarr = new int[]{ i , j };
    return retarr;
}