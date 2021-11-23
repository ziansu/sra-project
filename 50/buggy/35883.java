@org.blub.controller.RequestMapping(method = RequestMethod.PUT, value = "/{id}", consumes = "application/json")
public org.blub.domain.External_object_reference update(@org.blub.controller.PathVariable
java.lang.Long id, @org.blub.controller.RequestBody
org.blub.domain.External_object_reference eor) {
    eorRepository.save(eor);
    return eorRepository.findOne(id);
}