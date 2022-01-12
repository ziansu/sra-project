public static int determineFirst(int enemySpeed, int userSpeed) {
    if (enemySpeed == 0) {
        enemySpeed = 1;
    }
    double result = ((double) (userSpeed)) / ((double) (enemySpeed));
    result += (new java.util.Random().nextDouble()) - (new java.util.Random().nextDouble());
    if (result < 1) {
        return 1;
    }
    return 0;
}