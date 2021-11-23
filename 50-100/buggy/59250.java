private wtr.sim.Point randomMoveInRange(double maxDist) {
    double dir = ((random.nextDouble()) * 2) * (java.lang.Math.PI);
    double dx = 6 * (java.lang.Math.cos(dir));
    double dy = 6 * (java.lang.Math.sin(dir));
    preChatId = self_id;
    return new wtr.sim.Point(dx, dy, self_id);
}