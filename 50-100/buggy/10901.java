public void updateTimestepAccel(Body other) {
    double d = distance(other);
    for (int i = 0; i < 3; i++) {
        double a = ((Constants.G) * (other.mass)) * ((position[i]) - (other.position[i]));
        deltaAccel[i] += a / ((d * d) * d);
    }
}