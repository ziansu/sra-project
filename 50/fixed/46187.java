private void storeLocalizedAttributeName(long key, java.lang.String attributeName, java.lang.String language) {
    if (attributeName == null) {
        return ;
    }
    localizer.storeLocalizedResource(language, key, LocalizedObjectTypes.CUSTOM_ATTRIBUTE_NAME, attributeName);
}