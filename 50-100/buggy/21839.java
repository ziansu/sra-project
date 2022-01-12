public void goForward(double distance) {
    x = (x) + (distance * (java.lang.Math.cos(java.lang.Math.toRadians(angle))));
    y = (x) + (distance * (java.lang.Math.sin(java.lang.Math.toRadians(angle))));
}