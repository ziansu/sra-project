public void clipRect(java.lang.Object graphics, int x, int y, int width, int height) {
    if (width < 0) {
        width = 0;
    }
    if (height < 0) {
        height = 0;
    }
    com.codename1.impl.ios.IOSImplementation.NativeGraphics ng = ((com.codename1.impl.ios.IOSImplementation.NativeGraphics) (graphics));
    ng.checkControl();
    ng.clipRect(x, y, width, height);
}