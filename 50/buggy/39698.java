public android.graphics.Matrix refresh(android.graphics.Matrix newMatrix, com.github.mikephil.charting.charts.Chart<?> chart, boolean invalidate) {
    mMatrixTouch.set(newMatrix);
    limitTransAndScale(mMatrixTouch, mContentRect);
    chart.invalidate();
    newMatrix.set(mMatrixTouch);
    return newMatrix;
}