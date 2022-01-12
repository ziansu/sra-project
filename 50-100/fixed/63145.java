private int operationGenerator(int path) {
    java.util.Random rand = new java.util.Random();
    int difficulty;
    int[] operations = getPathsArray(path);
    do {
        difficulty = rand.nextInt(operations.length);
        if ((operations[difficulty]) != (-1)) {
            break;
        }
    } while ((operations[difficulty]) == (-1) );
    return operations[difficulty];
}