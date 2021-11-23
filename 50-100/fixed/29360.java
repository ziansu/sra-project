protected boolean fillAndParseForContent() {
    boolean handled = false;
    while (_parser.inContentState()) {
        int filled = fillRequestBuffer();
        boolean handle = parseRequestBuffer();
        handled |= handle;
        if ((handle || (filled <= 0)) || (_channel.getRequest().getHttpInput().hasContent()))
            break;
        
    } 
    return handled;
}