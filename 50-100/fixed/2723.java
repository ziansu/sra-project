public java.lang.String getXMLString(avscience.ppc.avscience.ppc.AvScienceDataObject obj) {
    avscience.ppc.Element e = getElementFromObject(obj);
    avscience.ppc.Document doc = new avscience.ppc.Document(e);
    avscience.ppc.XMLOutputter outputter = new avscience.ppc.XMLOutputter(avscience.ppc.Format.getPrettyFormat());
    try {
        return outputter.outputString(doc);
    } catch (java.lang.Exception ex) {
        java.lang.System.out.println(ex.toString());
    }
    return null;
}