public void setScreenSize(int width, int height) {
    this.requestedConstraints.widthType = net.drewke.tdme.gui.GUINode.RequestedConstraints.RequestedConstraintsType.PIXEL;
    this.requestedConstraints.width = width;
    this.requestedConstraints.heightType = net.drewke.tdme.gui.GUINode.RequestedConstraints.RequestedConstraintsType.PIXEL;
    this.requestedConstraints.height = height;
    this.computedConstraints.left = 0;
    this.computedConstraints.top = 0;
    this.computedConstraints.width = width;
    this.computedConstraints.height = height;
}