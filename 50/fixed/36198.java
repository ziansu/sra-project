@java.lang.Override
public void parse(java.lang.String field, net.anei.cadpage.parsers.MsgInfo.Data data) {
    super.parse(convertCodes(field, net.anei.cadpage.parsers.OH.OHButlerCountyBParser.CALL_CODES), data);
}