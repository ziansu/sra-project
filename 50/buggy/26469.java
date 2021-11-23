@java.lang.Override
public void setScale(double scale) {
    super.setScale(scale);
    setSpriteSheet(edu.chalmers.vaporwave.util.Utils.resize(this.originalSpriteSheet, scale));
}