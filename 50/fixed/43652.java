@org.blub.controller.RequestMapping(method = RequestMethod.GET)
public java.lang.Iterable<org.blub.domain.External_object_reference> list() {
    return eorRepository.findAll(1);
}