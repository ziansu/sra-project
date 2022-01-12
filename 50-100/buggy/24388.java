@java.lang.Override
public void update(int screenWidth, int screenHeight, boolean centerCamera) {
    setScreenBounds(0, 0, screenWidth, screenHeight);
    final float aspectRatio = ((float) (screenWidth)) / ((float) (screenHeight));
    setWorldSize((screenWidth * (unitsPerPixel)), (screenHeight * (unitsPerPixel)));
    apply(centerCamera);
}