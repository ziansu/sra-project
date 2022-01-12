public static java.lang.String mergeInfo(org.w3c.dom.Document doc1, org.w3c.dom.Document doc2) {
    return (((("<Info>\n" + "<references>") + (org.olanto.idxvli.ref.WSRESTUtil.getReferencesFromDocument(doc1, 0))) + (org.olanto.idxvli.ref.WSRESTUtil.getReferencesFromDocument(doc2, doc1.getElementsByTagName("reference").getLength()))) + "</references>") + "</Info>";
}