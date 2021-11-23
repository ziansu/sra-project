public org.jebtk.math.matrix.AnnotationMatrix addToHistory(org.jebtk.math.ui.matrix.transform.MatrixTransform transform, int selectedIndex) {
    if (transform == null) {
        return null;
    }
    transform.addMatrixTransformListener(this);
    mHistoryPanel.addItem(transform, selectedIndex).apply();
    return transform.getMatrix();
}