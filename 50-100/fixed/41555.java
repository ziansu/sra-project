private java.lang.String setOntology(java.lang.String title) throws org.xml.sax.SAXException {
    java.lang.String refId = ontologies.get(title);
    if (refId == null) {
        org.intermine.xml.full.Item ontology = createItem("Ontology");
        ontology.setAttribute("name", title);
        ontologies.put(title, ontology.getIdentifier());
        refId = ontology.getIdentifier();
        try {
            store(ontology);
        } catch (org.intermine.objectstore.ObjectStoreException e) {
            throw new org.xml.sax.SAXException(e);
        }
    }
    return refId;
}