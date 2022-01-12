private static float getAverageLuminance(java.awt.image.BufferedImage image, int x0, int y0, int width, int height) {
    int cnt = 0;
    float luminance = 0.0F;
    for (int x = x0; x < (x0 + width); x += 10) {
        for (int y = y0 - height; y < y0; y += 10) {
            luminance += de.acwhadk.rz.DesktopBGChanger.picture.PictureCaption.getLuminance(image, x, y);
            ++cnt;
        }
    }
    return luminance / cnt;
}