public java.util.Map getMap(java.lang.String dateFormat) throws net.sf.json.JSONException {
    java.util.Map dataMap = new java.util.HashMap();
    dataMap.put("dateFrom", org.votingsystem.util.DateUtils.getDateStr(dateFrom, dateFormat));
    dataMap.put("dateTo", org.votingsystem.util.DateUtils.getDateStr(dateTo, dateFormat));
    return dataMap;
}