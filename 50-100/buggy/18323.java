protected java.lang.String decode(java.lang.String in) {
    in = in.replace("&lt;", "<").replace("&gt;", ">");
    in = in.replace("&amp;", "&");
    in = in.replace("&quot;", "\"");
    in = in.replace("&#039;", "'");
    return in;
}