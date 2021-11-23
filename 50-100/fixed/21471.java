private boolean parse() {
    boolean handle = parser.parseNext(buffer);
    if (org.eclipse.jetty.client.http.LOG.isDebugEnabled())
        org.eclipse.jetty.client.http.LOG.debug("Parsed {}, remaining {} {}", handle, buffer.remaining(), parser);
    
    if (handle) {
        return !(parser.isStart());
    }
    return false;
}