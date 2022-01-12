@org.junit.BeforeClass
public static void setUp() throws java.io.IOException, java.net.URISyntaxException {
    expectedType = (org.verapdf.model.impl.pb.pd.TYPES.contains(PBoxPDAnnot.ANNOTATION_TYPE)) ? PBoxPDAnnot.ANNOTATION_TYPE : null;
    expectedID = null;
    org.verapdf.model.impl.pb.pd.PBoxPDAnnotTest.setUp(org.verapdf.model.impl.pb.pd.PBoxPDAnnotTest.FILE_RELATIVE_PATH);
    java.util.List<org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation> annotations = document.getPage(0).getAnnotations();
    org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation annot = annotations.get(((annotations.size()) - 1));
    actual = new org.verapdf.model.impl.pb.pd.PBoxPDAnnot(annot, document.getPage(0).getResources(), document, null);
}