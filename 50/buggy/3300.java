@java.lang.Override
public boolean parseMsg(java.lang.String subject, java.lang.String body, net.anei.cadpage.parsers.MsgInfo.Data data) {
    if (!(subject.equals("Fire Page")))
        return false;
    
    return parseFields(body.split("\n"), 4, data);
}