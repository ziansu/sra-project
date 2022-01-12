public int getSinkIndex(pb.sim.Asteroid[] asteroids, pb.sim.Asteroid sink) {
    for (int i = 0; i < (asteroids.length); i++) {
        if ((asteroids[i].id) == (sink.id))
            return i;
        
    }
    return -1;
}