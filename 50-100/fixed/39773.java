protected double getRouteLength(double[][] distanceMatrix) {
    routeLength = 0;
    for (int i = 0; i < (distanceMatrix[0].length); i++)
        routeLength += distanceMatrix[antRoute[i]][antRoute[(i + 1)]];
    
    return routeLength;
}