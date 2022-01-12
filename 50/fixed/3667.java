private java.lang.String getFirstName(ezvcard.property.StructuredName structuredName) {
    if ((structuredName != null) && (org.apache.commons.lang3.StringUtils.isNotBlank(structuredName.getGiven()))) {
        return structuredName.getGiven();
    }
    return null;
}