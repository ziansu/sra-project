public void setValue(int value) {
    this.value = value;
    this.valueLabel.setText(java.lang.Integer.toString(value));
    TileAnimation.animateTileCreation(this);
}