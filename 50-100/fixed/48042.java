public double getNearestObstacleDist(java.util.ArrayList<skynet.Obstacle> obstacles) {
    double dist = sonarRange;
    for (skynet.Obstacle o : obstacles) {
        double d = ((dist(o.getX(), o.getY(), xCenter, yCenter)) - (o.getRadius())) - (sensingRadius);
        if (d < dist) {
            dist = d;
        }
    }
    return dist;
}