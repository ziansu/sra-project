@java.lang.Override
public void parse(java.lang.String field, net.anei.cadpage.parsers.MsgInfo.Data data) {
    super.parse(field, data);
    if (field.startsWith("PD-"))
        data.strCity = "CASPER";
    else
        if (field.startsWith("NC"))
            data.strCity = "NATRONA COUNTY";
        else {
            java.lang.String city = net.anei.cadpage.parsers.WY.WYNatronaCountyParser.CITY_CODES.getProperty(field);
            if (city != null)
                data.strCity = city;
            
        }
    
}