@java.lang.Override
protected void drawBorder(org.eclipse.swt.graphics.GC gc, org.eclipse.swt.graphics.Rectangle rect) {
    if (_singleFrame) {
        org.eclipse.swt.graphics.Rectangle r = new org.eclipse.swt.graphics.Rectangle(0, 0, _spritesheet.getFrameWidth(), _spritesheet.getFrameHeight());
        r = phasereditor.ui.PhaserEditorUI.computeImageZoom(r, getBounds());
        super.drawBorder(gc, r);
    }else {
        super.drawBorder(gc, rect);
    }
}