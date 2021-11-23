@java.lang.Override
protected boolean parseMsg(java.lang.String body, net.anei.cadpage.parsers.MsgInfo.Data data) {
    java.lang.String[] flds = body.split("\n");
    if ((flds.length) > 1)
        return parseFields(flds, 3, data);
    
    return parseNewFormat(body, data);
}