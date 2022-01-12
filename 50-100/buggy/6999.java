private void getFillersFromFile(org.w3c.dom.Document doc, edu.illinois.cs.cogcomp.nlp.corpusreaders.ereReader.View nerView) throws edu.illinois.cs.cogcomp.nlp.corpusreaders.aceReader.XMLException {
    org.w3c.dom.Element element = doc.getDocumentElement();
    org.w3c.dom.Element fillerElement = edu.illinois.cs.cogcomp.nlp.corpusreaders.aceReader.SimpleXMLParser.getElement(element, edu.illinois.cs.cogcomp.nlp.corpusreaders.ereReader.FILLERS);
    org.w3c.dom.NodeList fillerNl = fillerElement.getElementsByTagName(edu.illinois.cs.cogcomp.nlp.corpusreaders.ereReader.FILLER);
    for (int i = 0; i < (fillerNl.getLength()); ++i)
        readFiller(fillerNl.item(i), nerView);
    
}