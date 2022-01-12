public heronarts.p3lx.ui.studio.UICollapsibleSection setExpanded(boolean expanded) {
    if ((this.expanded) != expanded) {
        this.expanded = expanded;
        this.content.setVisible(this.expanded);
        super.setHeight((this.expanded ? this.expandedHeight : heronarts.p3lx.ui.studio.UICollapsibleSection.CLOSED_HEIGHT));
        redraw();
    }
    return this;
}