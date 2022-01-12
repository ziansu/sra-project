@org.blub.controller.RequestMapping(method = RequestMethod.POST, consumes = "application/json")
public org.blub.domain.Document create(@org.blub.controller.RequestBody
org.blub.domain.Document document) {
    for (org.blub.domain.Document_relationship rel : document.getDocument_relationships()) {
        rel.setRelates_document(document);
        rel.setRelating_document(documentRepository.findOne(rel.getRelating_document().getGraphId()));
    }
    java.sql.Timestamp timestamp = new java.sql.Timestamp(new java.util.Date().getTime());
    document.setCreated_at(timestamp);
    documentRepository.save(document);
    return documentRepository.findOne(document.getGraphId(), 1);
}