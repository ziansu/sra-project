@java.lang.Override
public boolean parseMsg(java.lang.String subject, java.lang.String body, net.anei.cadpage.parsers.MsgInfo.Data data) {
    return parseFields(body.split("\n"), data);
}