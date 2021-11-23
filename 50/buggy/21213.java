public double getPathCost() {
    return (distances[0][index]) + (getParentCost());
}