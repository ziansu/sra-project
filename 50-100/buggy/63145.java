private int operationGenerator(int path) {
    java.util.Random rand = new java.util.Random();
    int difficulty = rand.nextInt((1 + path));
    int[] operations = getPathsArray(path);
    do {
        if ((operations[difficulty]) != (-1)) {
            break;
        }
        difficulty = rand.nextInt((1 + path));
    } while ((operations[difficulty]) == (-1) );
    return operations[difficulty];
}