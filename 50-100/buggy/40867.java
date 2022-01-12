private void fillArray(int numInts, int largestInt) {
    for (int loop = 0; loop < (myArray.length); loop++) {
        myArray[loop] = ((int) (((java.lang.Math.random()) * largestInt) + 1));
    }
}