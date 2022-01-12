public void setArea(final org.jtext.ui.graphics.Rectangle area) {
    this.area = area;
    layout.setDimension(area.dimension());
    for (org.jtext.ui.graphics.Widget w : widgets) {
        if ((w instanceof org.jtext.ui.graphics.Container) && (w.isVisible())) {
            ((org.jtext.ui.graphics.Container) (w)).setArea(layout.getAreaFor(w));
        }
    }
}