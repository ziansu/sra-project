public void reflect(Mirror m) {
    theta = java.lang.Math.toRadians(((360 - (java.lang.Math.toDegrees(theta))) + (2 * (java.lang.Math.toDegrees(m.theta)))));
    theta %= 2 * (java.lang.Math.PI);
}