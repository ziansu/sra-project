public void randomBombs() {
    int row;
    int column;
    for (int x = 0; x < 10; x++) {
        do {
            row = (generator.nextInt(9)) + 1;
            column = (generator.nextInt(9)) + 1;
        } while (mineArray[row][column] );
        mineArray[row][column] = true;
    }
}