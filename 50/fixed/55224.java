public boolean isPluralRecordTypeApplicable(final java.lang.String currentTagName) {
    if ((pluralXMLTag) == null) {
        return false;
    }
    return pluralXMLTag.equals(currentTagName);
}