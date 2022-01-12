public void moveRight() {
    cn.liutils.cgui.gui.WidgetContainer parent = getAbstractParent();
    int i = (parent.locate(this)) - 1;
    if (i >= 0) {
        cn.liutils.cgui.gui.Widget newParent = parent.getWidget(i);
        java.lang.String name = this.getName();
        parent.forceRemoveWidget(this);
        this.disposed = false;
        newParent.addWidget(name, this);
    }
}