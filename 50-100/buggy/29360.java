protected boolean fillAndParseForContent() {
    boolean handled = false;
    while (_parser.inContentState()) {
        if (org.eclipse.jetty.server.HttpConnection.LOG.isDebugEnabled())
            org.eclipse.jetty.server.HttpConnection.LOG.debug("{} parseContent", this);
        
        int filled = fillRequestBuffer();
        boolean handle = parseRequestBuffer();
        handled |= handle;
        if ((handle || (filled <= 0)) || (_channel.getRequest().getHttpInput().hasContent()))
            break;
        
    } 
    return handled;
}