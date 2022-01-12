@java.lang.Override
protected boolean parseMsg(java.lang.String subject, java.lang.String body, net.anei.cadpage.parsers.MsgInfo.Data data) {
    if (parseMsg3(body, data))
        return true;
    
    if (parseMsg1(subject, body, data))
        return true;
    
    if (parseMsg2(body, data))
        return true;
    
    return false;
}