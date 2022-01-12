@javax.annotation.Nonnull
private static java.lang.String trimRHSWS(@javax.annotation.Nonnull
java.lang.String s) {
    int i;
    for (i = (s.length()) - 1; i >= 0; --i) {
        int c = s.codePointAt(i);
        if (com.shapesecurity.salvation.Parser.WSP.matcher(new java.lang.String(new int[]{ c }, 0, 1)).find())
            break;
        
    }
    return s.substring(0, (i + 1));
}