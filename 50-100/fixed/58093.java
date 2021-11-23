public void initializeWithoutStarting() throws org.xml.sax.SAXException {
    confident = false;
    strBuf = null;
    line = 1;
    html4 = false;
    metaBoundaryPassed = false;
    wantsComments = tokenHandler.wantsComments();
    if (!(newAttributesEachTime)) {
        attributes = new nu.validator.htmlparser.impl.HtmlAttributes(mappingLangToXmlLang);
    }
    resetToDataState();
}