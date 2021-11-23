@java.lang.Override
public boolean checkParse(java.lang.String field, net.anei.cadpage.parsers.MsgInfo.Data data) {
    if ((selectValue.equals("CALL")) || (net.anei.cadpage.parsers.NC.NCOnslowCountyParser.CALL_LIST.contains(field))) {
        super.parse(field, data);
        return true;
    }
    return false;
}