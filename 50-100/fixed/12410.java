@java.lang.Override
public boolean parseMsg(java.lang.String subject, java.lang.String body, net.anei.cadpage.parsers.MsgInfo.Data data) {
    if (!(subject.startsWith("CAD Page")))
        return false;
    
    java.lang.String[] fields = body.split("\n");
    return parseFields(fields, data);
}