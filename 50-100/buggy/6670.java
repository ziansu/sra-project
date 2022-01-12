public java.lang.String getJSONByCode(java.lang.String reference) throws error.ApiNotReachableException, error.InvalidTokenException, error.KoronaCloudAPIErrorMessageException, org.codehaus.jettison.json.JSONException {
    reference = reference.replaceAll(" ", "%20");
    reference = reference.replaceAll("/", "%2F");
    reference = reference.replaceAll("&", "%26");
    reference = reference.replaceAll("#", "%23");
    reference = reference.replaceAll("!", "%21");
    reference = reference.replaceAll("%", "%20");
    return new java.lang.String(link.CloudLink.ApiCon.fetchData(DataType.product, ReferenceType.code, reference));
}