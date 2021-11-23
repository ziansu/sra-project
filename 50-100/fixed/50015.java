@java.lang.Override
public boolean checkParse(java.lang.String field, net.anei.cadpage.parsers.MsgInfo.Data data) {
    if ((field.startsWith("Cross Streets :")) || (field.startsWith("http:"))) {
        return net.anei.cadpage.parsers.MI.MIMidlandCountyParser.INFO_JUNK_PTN.matcher(getRelativeField((+1))).matches();
    }
    parse(field, data);
    return true;
}