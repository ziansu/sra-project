public void movePoint(android.graphics.Point oldPoint, android.graphics.Point newPoint) {
    for (android.graphics.Point point : points) {
        if (((point.x) == (newPoint.x)) && (point != oldPoint))
            return ;
        
    }
    points.remove(oldPoint);
    points.add(newPoint);
    sorted = false;
}