protected java.lang.String decode(java.lang.String in) {
    in = in.replace("&lt;", "<").replace("&gt;", ">");
    in = in.replace("&quot;", "\"");
    in = in.replace("&#039;", "'");
    in = in.replace("&amp;", "&");
    return in;
}