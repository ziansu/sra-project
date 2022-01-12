public void reflect(Mirror m) {
    if (((m.theta) == 0) || ((m.theta) == (java.lang.Math.PI))) {
        on = false;
    }else {
        theta = java.lang.Math.toRadians(((360 - (java.lang.Math.toDegrees(theta))) + (2 * (java.lang.Math.toDegrees(m.theta)))));
    }
}