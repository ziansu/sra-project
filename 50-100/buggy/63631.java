public Point[] findPoints(Point p) {
    java.util.ArrayList<Point> tmp = new java.util.ArrayList<Point>();
    for (int i = 0; i < (points.size()); ++i) {
        if (points.get(i).isEquals(p))
            tmp.add(points.get(i));
        
    }
    Point[] ans = new Point[tmp.size()];
    ans = tmp.toArray(ans);
    return ans;
}