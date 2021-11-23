@java.lang.Override
public java.lang.Integer fitnessGreaterIsBetter() {
    if ((path) == null) {
        return java.lang.Integer.MIN_VALUE;
    }
    double length = 0;
    java.lang.Integer attractiveness = 0;
    for (graph.Edge e : path.ways) {
        length += e.lengthInKilometers;
        attractiveness += e.rateWay();
    }
    java.lang.Double delta = java.lang.Math.abs((length - (location.wantedLength)));
    java.lang.Double returned = attractiveness - ((java.lang.Math.pow(delta, 3)) * 1000);
    return returned.intValue();
}