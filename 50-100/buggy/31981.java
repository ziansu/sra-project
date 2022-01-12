protected static java.util.List parseData(int d) {
    java.util.List points = new java.util.ArrayList(d);
    for (int i = 0; i < d; i = i + 2) {
        Point point = new Point(Dataset.dataset[i], Dataset.dataset[(i + 1)]);
        points.add(point);
    }
    return points;
}