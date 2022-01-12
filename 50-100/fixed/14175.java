public com.mikhaellopez.androidwebserver.Response response404(java.lang.String url) {
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    builder.append("<!DOCTYPE html><html><body>");
    builder.append((("Sorry, Can't Found " + url) + " !"));
    builder.append("</body></html>\n");
    return newFixedLengthResponse(builder.toString());
}