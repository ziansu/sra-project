static int locationMapping(double axisMin, double axisLocation, double axisMax, int gridResolution) {
    java.lang.Double gridLocation;
    gridLocation = ((axisLocation - axisMin) * gridResolution) / (axisMax - axisMin);
    return gridLocation.intValue();
}