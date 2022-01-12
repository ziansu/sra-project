public void process(org.jdom.Element root, org.apache.uima.cas.CAS aCas) {
    sb = new java.lang.StringBuilder();
    title = "";
    parse(root);
    cas = aCas;
    cas.setDocumentText(sb.toString());
    de.tudarmstadt.ukp.dkpro.core.api.metadata.type.DocumentMetaData.get(cas).setDocumentTitle(title);
    de.tudarmstadt.ukp.dkpro.core.api.metadata.type.DocumentMetaData.get(cas).setDocumentId(title);
}