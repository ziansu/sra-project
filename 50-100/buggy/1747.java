public static java.lang.String getFreundschaft(java.lang.String benutzer1, java.lang.String benutzer2) {
    java.lang.String result = "";
    connect();
    com.fhaachen.swe.freespace.main.Freundschaft freundschaft = com.fhaachen.swe.freespace.main.Freundschaft.findByCompositeKeys(benutzer1, benutzer2);
    disconnect();
    if (freundschaft != null) {
        result = freundschaft.toJson(true);
    }
    result = com.fhaachen.swe.freespace.main.Freundschaft.completeFreundschaft(result, benutzer1);
    return result;
}