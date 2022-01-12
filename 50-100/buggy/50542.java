public void updateHScrollBar() {
    double scale = this.controller.getZoomScalingFactor();
    double size = ModelWrapper.VIEW_WIDTH;
    cs355.GUIFunctions.setHScrollBarPosit(((int) (this.controller.getViewTopLeftCorner().x)));
    cs355.GUIFunctions.setHScrollBarKnob(((int) (size / scale)));
}