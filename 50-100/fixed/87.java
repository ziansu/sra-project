public void disconnect() {
    if ((startShape) != null) {
        this.startShape.disconnectWire(this);
        startShape.update();
    }
    if ((endShape) != null) {
        this.endShape.disconnectWire(this);
        endShape.update();
    }
}