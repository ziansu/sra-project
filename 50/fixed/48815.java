private int randomPuzzleNumber(int min, int max) {
    java.util.Random random = new java.util.Random();
    int puzzleNumber = (random.nextInt(((max - min) + 1))) + min;
    return puzzleNumber;
}