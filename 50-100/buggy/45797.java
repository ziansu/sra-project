protected float distanceFrom(float mx, float my) {
    float p1 = ((x) + 5) - my;
    float p2 = ((y) + 5) - mx;
    return ((float) (java.lang.Math.pow(p2, 2))) + ((float) (java.lang.Math.pow(p1, 2)));
}