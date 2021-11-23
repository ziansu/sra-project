private static java.lang.String buildMessageBody(java.lang.String activateKey) {
    java.lang.StringBuilder builder = new java.lang.StringBuilder();
    builder.append(com.ltu.fm.utils.S3ResourceLoaderUtil.getProperty(AppConfiguration.ACTIVATION_MESSAGE));
    builder.append(Constants.SPACE_STRING);
    builder.append(activateKey);
    return builder.toString();
}