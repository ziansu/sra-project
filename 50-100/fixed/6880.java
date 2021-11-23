@java.lang.Override
public org.lemurproject.galago.core.parse.Document nextDocument() throws java.io.IOException {
    org.lemurproject.galago.core.parse.Document doc = super.nextDocument();
    if (!(doc == null)) {
        org.lemurproject.galago.core.parse.Document nerDoc = new org.lemurproject.galago.core.parse.Document();
        nerDoc.text = doNER(doc.text);
        nerDoc.metadata = doc.metadata;
        nerDoc.name = doc.name;
        java.lang.System.out.println(nerDoc.text);
        ciir.proteus.parse.NamedEntityRecorder ner = new ciir.proteus.parse.NamedEntityRecorder(outputPath);
        ner.record(nerDoc);
        doc = nerDoc;
    }
    return doc;
}