@java.lang.Override
protected boolean parseMsg(java.lang.String subject, java.lang.String body, net.anei.cadpage.parsers.MsgInfo.Data data) {
    if (!(subject.equals("CADPage")))
        return false;
    
    if (!(super.parseMsg(body, data)))
        return false;
    
    if ((data.strCall.length()) == 0)
        data.strCall = data.strCode;
    
    if ((data.strCall.length()) == 0)
        data.strCall = "ALERT";
    
    return true;
}