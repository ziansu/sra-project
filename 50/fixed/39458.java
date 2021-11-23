@java.lang.Override
protected boolean parseMsg(java.lang.String body, net.anei.cadpage.parsers.MsgInfo.Data data) {
    body = net.anei.cadpage.parsers.dispatch.DispatchA49Parser.REMARKS_PTN.matcher(body).replaceFirst("$1:\n");
    return parseFields(body.split("\n+"), data);
}