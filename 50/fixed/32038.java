public unitController.EnemyData getEnemyData(int level) {
    output = new unitController.EnemyData();
    resetOutput();
    getEnemyStat(level);
    getEnemyImage(level);
    getEnemyStartPosition();
    return output;
}