protected int skipWSC() throws java.io.IOException, org.openrdf.rio.RDFHandlerException {
    int c = readCodePoint();
    while ((org.openrdf.rio.turtle.TurtleUtil.isWhitespace(c)) || (c == '#')) {
        if (c == '#') {
            processComment();
        }else
            if (c == '\n') {
                (lineNumber)++;
            }
        
        c = readCodePoint();
    } 
    unread(c);
    return c;
}