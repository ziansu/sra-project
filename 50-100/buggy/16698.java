@java.lang.Override
public java.lang.Object loadTrueTypeFont(java.lang.String fontName, java.lang.String fileName) {
    com.codename1.impl.ios.IOSImplementation.NativeFont fnt = new com.codename1.impl.ios.IOSImplementation.NativeFont();
    fnt.face = com.codename1.ui.Font.FACE_SYSTEM;
    fnt.size = com.codename1.ui.Font.SIZE_MEDIUM;
    fnt.style = com.codename1.ui.Font.STYLE_PLAIN;
    fnt.name = nativeFontName(fontName);
    fnt.peer = com.codename1.impl.ios.IOSImplementation.nativeInstance.createTruetypeFont(fontName);
    return fnt;
}