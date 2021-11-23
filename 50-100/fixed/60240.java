public static java.lang.String generateFileUrl(java.lang.String farmerId, java.lang.String meta) {
    java.lang.String encodedId = controllers.SecurityUtils.encodeToString(farmerId);
    java.lang.String encodedMeta = controllers.SecurityUtils.encodeToString(meta);
    java.lang.String secret = controllers.SecurityUtils.createSecret(encodedId, encodedMeta);
    java.lang.String identifier = controllers.SecurityUtils.encodeToString(secret);
    java.lang.String genUrl = (((("/" + encodedId) + "/") + encodedMeta) + "/") + identifier;
    return genUrl;
}