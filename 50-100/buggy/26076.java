@java.lang.Override
public heronarts.p3lx.ui.studio.UICollapsibleSection setHeight(float h) {
    this.expandedHeight = ((int) (java.lang.Math.max(heronarts.p3lx.ui.studio.UICollapsibleSection.CLOSED_HEIGHT, h)));
    super.setHeight(h);
    if ((getContentTarget()) != null) {
        getContentTarget().setHeight(java.lang.Math.max(0, (((this.expandedHeight) - (heronarts.p3lx.ui.studio.UICollapsibleSection.PADDING)) - (heronarts.p3lx.ui.studio.UICollapsibleSection.CONTENT_Y))));
    }
    return this;
}