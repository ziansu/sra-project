@org.blub.controller.RequestMapping(method = RequestMethod.GET, value = "/{id}")
public org.blub.domain.Document find(@org.blub.controller.PathVariable
java.lang.Long id) {
    org.blub.domain.Document doc = documentRepository.findOne(id);
    org.blub.domain.Document trueSuccessor = documentRepository.getSuccessorDocument(id);
    doc.setSuccessorDocument(trueSuccessor);
    return doc;
}