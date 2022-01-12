@java.lang.Override
public java.lang.String transform(gov.usgs.cida.nude.resultset.inmemory.TableRow row) {
    java.lang.String value = row.getValue(gov.usgs.cida.nar.connector.SOSConnector.SOS_SITE_COL);
    int orderedVal = (value.length()) * (java.lang.Integer.parseInt(value));
    java.lang.String stringVal = java.lang.String.valueOf(orderedVal);
    return stringVal;
}