public static int determineFirst(int enemySpeed, int userSpeed) {
    double result = ((double) (userSpeed)) / ((double) (enemySpeed));
    result += (new java.util.Random().nextDouble()) - (new java.util.Random().nextDouble());
    if (result < 1) {
        return 1;
    }
    return 0;
}