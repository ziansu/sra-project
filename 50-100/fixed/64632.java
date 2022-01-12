private java.lang.String getEmailText(java.lang.String userType, java.lang.String code) {
    java.lang.StringBuilder emailTextBuilder = new java.lang.StringBuilder(50);
    emailTextBuilder.append(getInviteName(userType));
    emailTextBuilder.append(emailBodyTemplate);
    emailTextBuilder.append("\n\n\n\n");
    return java.lang.String.format(emailTextBuilder.toString(), ((((activateURL) + userType) + "/") + code));
}