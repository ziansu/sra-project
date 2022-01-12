private static void startBackground(com.podevs.android.utilities.SpannableStringBuilder text, org.xml.sax.Attributes attributes) {
    java.lang.String color = attributes.getValue("", "color");
    int c = -1;
    if ((color != null) && (!(color.equals("")))) {
        color = color.substring(6);
        try {
            c = com.podevs.android.utilities.MyColor.parseColor(color);
        } catch (java.lang.IllegalArgumentException e) {
            c = MyColor.BLACK;
        }
    }
    com.podevs.android.utilities.HtmlToSpannedConverter.start(text, new com.podevs.android.utilities.BackgroundColorSpan(c));
}