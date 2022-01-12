public java.util.List<java.lang.Float> getMajorPoints() {
    java.util.List<java.lang.Float> points = new java.util.ArrayList<>();
    float diff = (getMax()) - (getMin());
    float div = 10000000;
    while (div > diff)
        div /= 10;
    
    for (float i = 0; i < (div * 10); i += div / 2)
        points.add(i);
    
    return points;
}