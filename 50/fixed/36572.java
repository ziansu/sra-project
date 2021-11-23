public static java.lang.String applyForeColor(java.lang.String text, int colorByte) {
    return com.athaydes.osgiaas.api.ansi.Ansi.asString(com.athaydes.osgiaas.api.ansi.Ansi.join(com.athaydes.osgiaas.api.ansi.Ansi.foreColorEscape(colorByte), text));
}