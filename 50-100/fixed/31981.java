protected static java.util.List parseData(int d) {
    java.util.List points = new java.util.ArrayList(d);
    for (int i = 0; i < d; i++) {
        Point point = new Point(Dataset.dataset[(2 * i)], Dataset.dataset[((2 * i) + 1)]);
        points.add(point);
    }
    return points;
}