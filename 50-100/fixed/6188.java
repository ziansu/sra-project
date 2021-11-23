public int getSinkIndex(pb.sim.Asteroid[] asteroids, long sink) {
    for (int i = 0; i < (asteroids.length); i++) {
        if ((asteroids[i].id) == sink)
            return i;
        
    }
    return -1;
}