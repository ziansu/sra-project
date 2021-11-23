private void addToSpine(org.hl7.fhir.utilities.xml.XMLWriter xml, java.lang.String n) throws java.io.IOException {
    int i = getEntryIndex(n);
    if (i >= 0) {
        xml.comment(n, false);
        xml.attribute("idref", ("n" + (java.lang.Integer.toString(i))));
        xml.element("itemref", null);
    }
}