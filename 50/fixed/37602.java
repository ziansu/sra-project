public com.badlogic.gdx.graphics.Color getBackgroundColor(int level) {
    int index = (level - 0) % (brightestColor.length);
    return normalColor[index];
}