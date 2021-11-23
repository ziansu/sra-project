public double calcUnusedWallArea() {
    double doorArea = calcDoorArea();
    double windowArea = calcWindowArea();
    return ((calcTotalWallArea()) - doorArea) - windowArea;
}