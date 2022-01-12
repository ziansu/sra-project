public void setLayer(int newLayer) {
    this.setX((newLayer - (java.lang.Math.abs(((layer) - (this.getBoundsInLocal().getMinX()))))));
    this.layer = newLayer;
}