public void updateVScrollBar() {
    double scale = this.controller.getZoomScalingFactor();
    double size = ModelWrapper.VIEW_HEIGHT;
    cs355.GUIFunctions.setVScrollBarPosit(((int) (this.controller.getViewTopLeftCorner().y)));
    cs355.GUIFunctions.setVScrollBarKnob(((int) (size / scale)));
}