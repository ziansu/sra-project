public int[] calculateBoundariesAltitudeDiagram(int minY, int maxY) {
    int[] boundaries = new int[2];
    boundaries[0] = minY / 100;
    boundaries[0] = (boundaries[0]) * 10;
    boundaries[1] = maxY / 100;
    boundaries[1] = ((boundaries[1]) + 1) * 100;
    return boundaries;
}