@java.lang.Override
protected java.lang.String getContextIdForAccessAttempt(org.forgerock.http.protocol.Request request) {
    try {
        java.lang.String jsonString = request.getEntity().getString();
        if (org.apache.commons.lang.StringUtils.isNotEmpty(jsonString)) {
            org.forgerock.json.JsonValue jsonValue = org.forgerock.openam.utils.JsonValueBuilder.toJsonValue(jsonString);
            if (jsonValue.isDefined(org.forgerock.openam.core.rest.authn.AUTH_ID)) {
                populateContextFromAuthId(jsonValue.get(org.forgerock.openam.core.rest.authn.AUTH_ID).asString());
            }
        }
        return super.getContextIdForAccessAttempt(request);
    } catch (java.io.IOException e) {
        return "";
    }
}