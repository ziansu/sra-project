@java.lang.Override
public java.lang.String adjustMapCity(java.lang.String city) {
    return convertCodes(city.toUpperCase(), net.anei.cadpage.parsers.WV.WVBooneCountyParser.MAP_CITIES);
}