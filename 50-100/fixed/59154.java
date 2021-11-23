public org.jebtk.math.matrix.AnnotationMatrix addToHistory(int selectedIndex, org.jebtk.math.ui.matrix.transform.MatrixTransform transform) {
    if (transform == null) {
        return null;
    }
    transform.addMatrixTransformListener(this);
    mHistoryPanel.addItem(transform, selectedIndex).apply();
    return transform.getMatrix();
}