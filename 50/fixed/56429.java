@org.blub.controller.RequestMapping(method = RequestMethod.POST, consumes = "application/json")
public org.blub.domain.External_object_reference create(@org.blub.controller.RequestBody
org.blub.domain.External_object_reference eor) {
    eorRepository.save(eor, 1);
    return eorRepository.findOne(eor.getId(), 1);
}