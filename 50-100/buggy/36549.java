public void appendPoints(lecho.lib.hellocharts.model.PointValue[] points) {
    for (lecho.lib.hellocharts.model.PointValue point : points) {
        mPoints.add(point);
        mLastXCoord += mXStep;
        if (((mPoints.size()) > (mMaxPoints)) && (!(mScrollable))) {
            mPoints.remove(0);
        }
    }
    scrollViewport();
    initChart();
}