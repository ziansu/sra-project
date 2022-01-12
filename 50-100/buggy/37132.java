private static org.htmlcleaner.HtmlCleaner createHtmlCleaner() {
    org.htmlcleaner.HtmlCleaner result = new org.htmlcleaner.HtmlCleaner();
    org.htmlcleaner.CleanerProperties cleanerProperties = result.getProperties();
    cleanerProperties.setOmitXmlDeclaration(true);
    cleanerProperties.setOmitDoctypeDeclaration(false);
    cleanerProperties.setTranslateSpecialEntities(true);
    cleanerProperties.setTransSpecialEntitiesToNCR(true);
    cleanerProperties.setIgnoreQuestAndExclam(true);
    cleanerProperties.setUseEmptyElementTags(false);
    cleanerProperties.setAdvancedXmlEscape(true);
    cleanerProperties.setTransResCharsToNCR(true);
    return result;
}