public void bindYtoX() {
    endXProperty().addListener(bindXYListener);
    setEndY(getX().getValue());
}