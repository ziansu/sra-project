public void loadFromXml(org.xmlpull.v1.XmlPullParser xml) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
    name = xml.getAttributeValue(null, "name");
    imageUri = xml.getAttributeValue(null, "uri");
    annotations = new java.util.ArrayList<>();
    xml.nextTag();
    while (xml.getName().equals("annotation")) {
        edu.msu.becketta.dialog_simple.Annotation newAnnot = new edu.msu.becketta.dialog_simple.Annotation();
        newAnnot.loadAnnotationsXml(xml);
        annotations.add(newAnnot);
        xml.nextTag();
    } 
}