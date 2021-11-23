public static FontMeta.Explicit getFontMeta(int style, int size) {
    return new de.tucottbus.kt.lcars.swt.FontMeta.Explicit(de.tucottbus.kt.lcars.LCARS.getFontMeta(style), ((int) ((size * (de.tucottbus.kt.lcars.LCARS.fontScale)) + 0.5)));
}