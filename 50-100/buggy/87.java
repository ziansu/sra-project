public void disconnect() {
    if ((startShape) != null) {
        this.startShape.disconnectWire(this);
        ((edu.byu.ece.rapidSmith.device.vsrt.gui.QTreeElement) (this.startParent.parent())).markPinAsUnconnected(startParent);
        startShape.update();
    }
    if ((endShape) != null) {
        this.endShape.disconnectWire(this);
        ((edu.byu.ece.rapidSmith.device.vsrt.gui.QTreeElement) (this.endParent.parent())).markPinAsUnconnected(endParent);
        endShape.update();
    }
}