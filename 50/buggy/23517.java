private static boolean isInvalidEventType(java.lang.String eventType) {
    java.lang.String type = eventType.replaceAll(":", "").replaceAll("_", "");
    return org.apache.commons.lang3.StringUtils.isAlphanumeric(type);
}