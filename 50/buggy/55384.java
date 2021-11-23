protected void clearWidget() {
    if (((widget) != null) && (widget.isAttached())) {
        widget.removeFromParent();
        widget = null;
    }
    destroyChildren();
}