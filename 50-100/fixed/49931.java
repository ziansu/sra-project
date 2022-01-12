@java.lang.Override
public final void update(final float tpf) {
    timeCount += tpf;
    time += tpf;
    if ((timeCount) > (spawnBallTime)) {
        timeCount = 0;
        pengFac.makeStandardPenguin();
    }
    final int spawnSpear = 5;
    if ((time) > spawnSpear) {
        time = 0;
        obstacleFactory = getObstacleFactory();
        if ((obstacleFactory) != null) {
            spawnObstacle(obstacleFactory);
        }
    }
}