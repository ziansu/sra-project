public boolean add(double cost) {
    double newCost = (totalCost) + cost;
    if (newCost > (maxCost))
        return false;
    
    if (newCost < (minCost))
        return false;
    
    totalCost = newCost;
    return true;
}