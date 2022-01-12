@java.lang.Override
public void setScale(double scale) {
    super.setScale(scale);
    setSpriteSheet(this.originalSpriteSheet);
}