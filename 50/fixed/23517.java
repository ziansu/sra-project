private static boolean isInvalidEventType(java.lang.String eventType) {
    return (eventType == null) || (!(org.apache.commons.lang3.StringUtils.isAlphanumeric(eventType.replaceAll(":", "").replaceAll("_", ""))));
}