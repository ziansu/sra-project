@java.lang.Override
protected boolean parseMsg(java.lang.String subject, java.lang.String body, net.anei.cadpage.parsers.MsgInfo.Data data) {
    if (body.startsWith("Message-Id:")) {
        int pt = body.indexOf('\n');
        if (pt < 0)
            return false;
        
        body = body.substring((pt + 1)).trim();
    }
    return super.parseMsg(subject, body, data);
}