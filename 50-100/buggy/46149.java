public void randomBombs() {
    int row;
    int column;
    for (int x = 0; x < 10; x++) {
        row = (generator.nextInt(9)) + 1;
        column = (generator.nextInt(9)) + 1;
        mineArray[row][column] = true;
    }
}