public int roll() {
    float d1 = ((float) (java.lang.Math.random()));
    float d2 = d1 * 6;
    int d3 = java.lang.Math.floor(d2);
    return d3 + 1;
}