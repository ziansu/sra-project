@java.lang.Override
public void parse(java.lang.String field, net.anei.cadpage.parsers.MsgInfo.Data data) {
    java.util.regex.Matcher match = net.anei.cadpage.parsers.TX.TXMontgomeryCountyBParser.ID_PTN.matcher(field);
    if (!(match.matches()))
        abort();
    
    java.lang.String id = match.group(1);
    if (id != null) {
        data.strCallId = id;
    }else {
        data.strCallId = match.group(2);
        data.strTime = match.group(3);
    }
}