@java.lang.Override
protected boolean parseMsg(java.lang.String subject, java.lang.String body, net.anei.cadpage.parsers.MsgInfo.Data data) {
    if (((subject.length()) > 0) && (body.startsWith("CAD:;"))) {
        body = (("CAD:" + subject) + ": ") + (body.substring(4));
    }
    return super.parseMsg(body, data);
}