public java.lang.String getUsersSignOutApi(java.lang.String email) {
    com.google.common.base.Preconditions.checkArgument(org.apache.commons.lang3.StringUtils.isNotBlank(email));
    return val(org.sagebionetworks.bridge.sdk.Config.Props.V3_PARTICIPANT_SIGNOUT, new org.apache.http.message.BasicNameValuePair(org.sagebionetworks.bridge.sdk.Config.EMAIL, email));
}