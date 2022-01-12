private void fillArray(int numInts, int largestInt) {
    for (int index = 0; index < (myArray.length); index++) {
        myArray[index] = ((int) (((java.lang.Math.random()) * largestInt) + 1));
    }
}