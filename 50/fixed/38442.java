public void updateTheta(double rate) {
    double deltaTheta = ((-1) * rate) * (delta);
    theta += deltaTheta;
}