public void update(final com.jfixby.cmns.api.geometry.CanvasPosition position) {
    this.position.set(position);
    this.white_bridge.setCenter(position);
    this.whiteL.setCenter(position);
    this.whiteR.setCenter(position);
    this.redAnus.setPosition(position);
    this.redCircle.setCenter(position);
    this.whiteSquare.setCenter(position);
    com.jfixby.cmns.api.collections.Collections.scanCollection(this.touchAreas, this.touchAreasAligner);
}