@java.lang.Override
public boolean checkParse(java.lang.String field, net.anei.cadpage.parsers.MsgInfo.Data data) {
    java.util.regex.Matcher match = net.anei.cadpage.parsers.WA.WASnohomishCountyBParser.CALL_CHANNEL_PTN.matcher(field);
    if (match.matches()) {
        data.strCall = match.group(1);
        data.strChannel = match.group(2);
    }else {
        data.strCall = field;
    }
    return true;
}