protected double getRouteLength(double[][] distanceMatrix) {
    for (int i = 0; i < (distanceMatrix.length); i++) {
        routeLength += distanceMatrix[antRoute[i]][antRoute[(i + 1)]];
    }
    return routeLength;
}