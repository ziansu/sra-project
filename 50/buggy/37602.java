public com.badlogic.gdx.graphics.Color getBackgroundColor(int level) {
    int index = (level - 1) % (brightestColor.length);
    return normalColor[index];
}