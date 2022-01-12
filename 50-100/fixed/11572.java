public double getMinY() {
    double minY = points.get(0).y;
    for (int i = 1; i < (points.size()); i++) {
        double pY = points.get(i).y;
        if (pY < minY) {
            minY = pY;
        }
    }
    return minY;
}