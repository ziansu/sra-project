public int getSinkIndex(pb.sim.Asteroid[] asteroids) {
    long maxID = java.lang.Long.MIN_VALUE;
    int maxIndex = -1;
    for (int i = 0; i < (asteroids.length); i++) {
        java.lang.System.out.print(((asteroids[i].id) + " "));
        if ((asteroids[i].id) > maxID) {
            maxID = asteroids[i].id;
            maxIndex = i;
        }
    }
    java.lang.System.out.println();
    return maxIndex;
}