public double getPathCost() {
    return (distances[index][0]) + (getParentCost());
}