protected boolean parseHtmlMsg(java.lang.String subject, java.lang.String body, net.anei.cadpage.parsers.MsgInfo.Data data) {
    boolean force = body.startsWith("<!DOCTYPE");
    if (force) {
        body = cleanDocHeaders(body);
        if (body == null)
            return false;
        
    }
    if (parseUntrimmedMsg(subject, net.anei.cadpage.parsers.MsgParser.decodeHtmlSequence(body), data))
        return true;
    
    if (force) {
        setFieldList("INFO");
        data.parseGeneralAlert(this, body);
        return true;
    }
    return false;
}