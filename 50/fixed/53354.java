public java.lang.String getUsersSignOutApi(java.lang.String id) {
    com.google.common.base.Preconditions.checkArgument(org.apache.commons.lang3.StringUtils.isNotBlank(id));
    return java.lang.String.format(val(org.sagebionetworks.bridge.sdk.Config.Props.V3_PARTICIPANT_SIGNOUT), id);
}