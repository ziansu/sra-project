public android.graphics.Matrix refresh(android.graphics.Matrix newMatrix, android.view.View chart, boolean invalidate) {
    mMatrixTouch.set(newMatrix);
    limitTransAndScale(mMatrixTouch, mContentRect);
    chart.invalidate();
    newMatrix.set(mMatrixTouch);
    return newMatrix;
}