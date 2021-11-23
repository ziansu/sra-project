@java.lang.Override
public void parse(java.lang.String field, net.anei.cadpage.parsers.MsgInfo.Data data) {
    super.parse(field, data);
    if (net.anei.cadpage.parsers.OH.OHGreeneCountyParser.MM_PTN.matcher(data.strApt).matches()) {
        data.strAddress = append(data.strAddress, " ", data.strApt);
        data.strApt = "";
    }
    if (data.strCross.equalsIgnoreCase("No Cross Streets Found"))
        data.strCross = "";
    
    if (data.strCity.equals("CAESARCREEK TWP"))
        data.strCity = "CAESARSCREEK TWP";
    
}