@javax.annotation.Nonnull
private static java.lang.String trimRHSWS(@javax.annotation.Nonnull
java.lang.String s) {
    int i;
    for (i = s.length(); i > 0; --i) {
        int c = s.codePointAt((i - 1));
        if ((c != ' ') && (c != '\t'))
            break;
        
    }
    return s.substring(0, i);
}