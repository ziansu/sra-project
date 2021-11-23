public static org.aludratest.content.xml.XmlDiffDetail different(java.lang.Object expected, java.lang.Object actual, java.lang.String objectClassifier, java.lang.String locatorOfActual) {
    return new org.aludratest.content.xml.util.DatabeneXmlDiffDetail(expected, actual, objectClassifier, org.databene.formats.compare.DiffDetailType.DIFFERENT, locatorOfActual, locatorOfActual);
}