private double calculateAverage(int fromIndex, int t) {
    if (((fromIndex - t) + 1) < 0)
        return 0.0;
    
    double d = 0;
    for (int i = (fromIndex - t) + 1; i <= fromIndex; i++) {
        d += stockItems.get(i).getEndPrice();
    }
    return d / t;
}