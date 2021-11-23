public static java.lang.String toHtml(android.text.Spanned text) {
    java.lang.StringBuilder out = new java.lang.StringBuilder();
    com.pxh.richparser.RichHtml.withinHtml(out, text);
    return android.text.Html.toHtml(text);
}