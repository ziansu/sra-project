protected static boolean match(java.lang.String originalProperty, java.lang.String newProperty, java.lang.String newPropertyPath, int minOccurrences, java.lang.String[] portletNames) {
    if (!(com.liferay.upgrade.properties.locator.PropertiesLocator.pathContainsPortletName(newPropertyPath, portletNames))) {
        return false;
    }
    java.lang.String originalPropertyWithoutPrefix = com.liferay.upgrade.properties.locator.PropertiesLocator.removeCommonPrefix(originalProperty);
    int numOccurrences = com.liferay.upgrade.properties.locator.PropertiesLocator.getOccurrences(originalPropertyWithoutPrefix, newProperty);
    if ((numOccurrences == 0) || (numOccurrences < minOccurrences)) {
        return false;
    }
    return true;
}