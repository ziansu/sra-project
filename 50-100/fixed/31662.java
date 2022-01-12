public void zoom(float scaleX, float scaleY, float x, float y) {
    android.graphics.Matrix save = mViewPortHandler.zoom(scaleX, scaleY, x, y);
    mViewPortHandler.refresh(save, this, false);
    calculateOffsets();
    com.github.mikephil.charting.charts.BarLineChartBase.postInvalidate();
}