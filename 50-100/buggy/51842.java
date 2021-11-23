public static java.lang.String toJsonObject(com.onepagecrm.models.Email email) {
    org.json.JSONObject emailObject = new org.json.JSONObject();
    addJsonStringValue(email.getType().toLowerCase(), emailObject, com.onepagecrm.models.serializer.TYPE_TAG);
    addJsonStringValue(email.getValue(), emailObject, com.onepagecrm.models.serializer.VALUE_TAG);
    return emailObject.toString();
}