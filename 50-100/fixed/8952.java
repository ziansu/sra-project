private void handlePaint() {
    if (!(_updateThumb))
        return ;
    
    final org.eclipse.swt.graphics.Rectangle rect = _table.getVisibleScrollableCells();
    final int max = ((_scroll.getMaximum()) - (_scroll.getMinimum())) + 1;
    final int tWidth = java.lang.Math.min(java.lang.Math.max(1, rect.width), max);
    _scroll.setThumb(tWidth);
    _scroll.setEnabled((tWidth != max));
}