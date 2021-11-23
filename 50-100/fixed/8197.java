public void update(final com.jfixby.cmns.api.geometry.CanvasPosition position) {
    this.position.set(position);
    this.white_bridge.setCenter(this.position);
    this.whiteL.setCenter(this.position);
    this.whiteR.setCenter(this.position);
    this.redAnus.setPosition(this.position);
    this.redCircle.setCenter(this.position);
    this.whiteSquare.setCenter(this.position);
    com.jfixby.cmns.api.collections.Collections.scanCollection(this.touchAreas, this.touchAreasAligner);
}