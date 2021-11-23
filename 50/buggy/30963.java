private void fixCity(net.anei.cadpage.parsers.MsgInfo.Data data) {
    java.lang.String city = net.anei.cadpage.parsers.PA.PAClarionCountyEParser.MISSPELLED_CITY_TABLE.getProperty(data.strCity.toUpperCase());
    if (city != null)
        data.strCity = city;
    
}