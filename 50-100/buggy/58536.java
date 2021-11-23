@java.lang.Override
public org.lemurproject.galago.core.parse.Document nextDocument() throws java.io.IOException {
    org.lemurproject.galago.core.parse.Document doc = super.nextDocument();
    org.lemurproject.galago.core.parse.Document nerDoc = new org.lemurproject.galago.core.parse.Document();
    nerDoc.text = doNER(doc.text);
    nerDoc.metadata = doc.metadata;
    nerDoc.name = doc.name;
    ciir.proteus.parse.NamedEntityRecorder ner = new ciir.proteus.parse.NamedEntityRecorder(outputPath);
    ner.record(doc);
    return doc;
}