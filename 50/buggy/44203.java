private void addPoint(ru.sukharev.pathtracker.utils.orm.MapPoint point) {
    synchronized(mPoints) {
        mPoints.add(point);
    }
}