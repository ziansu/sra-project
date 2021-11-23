public void updateTimestepAccel(Body other) {
    double d = distance(other);
    for (int i = 0; i < 3; i++) {
        double a = ((Constants.G) * (other.mass)) * ((other.position[i]) - (position[i]));
        deltaAccel[i] += a / ((d * d) * d);
    }
}