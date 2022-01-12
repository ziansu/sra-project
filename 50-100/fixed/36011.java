public void appendPoint(lecho.lib.hellocharts.model.PointValue point) {
    mPoints.add(point);
    if (((mPoints.size()) > (mMaxPoints)) && (!(mScrollable))) {
        mPoints.remove(0);
    }
    mLastXCoord += mXStep;
    if (!(mScrollable)) {
        scrollViewport();
    }
    initChart();
}