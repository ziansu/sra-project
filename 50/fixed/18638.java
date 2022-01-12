public void onAdded() {
    for (cn.liutils.cgui.gui.component.Component.Node n : addedHandlers) {
        widget.listen(n.type, n.handler, n.prio, false);
    }
}