public int getBlocks(int[] A, int maxBound) {
    int blockingNumber = 0;
    int tempSum = 0;
    for (int aA : A) {
        if ((tempSum + aA) <= maxBound)
            tempSum += aA;
        else {
            blockingNumber++;
            tempSum = aA;
        }
    }
    return blockingNumber;
}