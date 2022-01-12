@org.blub.controller.RequestMapping(method = RequestMethod.POST, consumes = "application/json")
public org.blub.domain.Document create(@org.blub.controller.RequestBody
org.blub.domain.Document document) {
    java.sql.Timestamp timestamp = new java.sql.Timestamp(new java.util.Date().getTime());
    document.setCreated_at(timestamp);
    documentRepository.save(document);
    return documentRepository.findOne(document.getGraphId(), 1);
}