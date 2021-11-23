public int hamming() {
    int outOfPlace = 0;
    int target = 0;
    int value = 0;
    for (int row = 0; row < (N); row++) {
        for (int col = 0; col < (N); col++) {
            if ((blocks[row][col]) != (goalBoard[row][col]))
                outOfPlace++;
            
        }
    }
    return outOfPlace;
}