@java.lang.Override
public void parse(java.lang.String field, net.anei.cadpage.parsers.MsgInfo.Data data) {
    java.util.regex.Matcher match = net.anei.cadpage.parsers.dispatch.DispatchA22Parser.ID_SRC_PTN.matcher(field);
    if (!(match.matches()))
        abort();
    
    data.strCallId = match.group(1).trim();
    data.strSource = match.group(2).trim();
}