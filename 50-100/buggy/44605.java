public void clipRect(java.lang.Object graphics, int x, int y, int width, int height) {
    com.codename1.impl.ios.IOSImplementation.NativeGraphics ng = ((com.codename1.impl.ios.IOSImplementation.NativeGraphics) (graphics));
    ng.checkControl();
    ng.clipRect(x, y, width, height);
}