private static java.lang.String cleanAttributeName(java.lang.String name) {
    java.lang.String attributeName = org.apache.commons.lang3.StringUtils.trim(name);
    if (com.notronix.newrelic.events.NewRelicEvent.RESERVED_KEYWORDS.contains(org.apache.commons.lang3.StringUtils.lowerCase(attributeName))) {
        attributeName = ("`" + attributeName) + "`";
    }
    return attributeName;
}