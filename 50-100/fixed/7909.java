public static java.lang.String getAddPropertyDetailsData(java.lang.String address, java.lang.String propertyAge, int PropertyResidentialOrCommercial, java.lang.String typeOfProperty, java.lang.String postCode) {
    org.json.JSONObject object = new org.json.JSONObject();
    try {
        object.put("address", address);
        object.put("age", propertyAge);
        object.put("category_primary", PropertyResidentialOrCommercial);
        object.put("category_secondary", typeOfProperty);
        object.put("postcode", postCode);
    } catch (org.json.JSONException var8) {
        var8.printStackTrace();
    }
    return object.toString();
}