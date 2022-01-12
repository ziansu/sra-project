@com.adswizz.controller.RequestMapping(method = RequestMethod.POST)
public org.springframework.http.ResponseEntity create(@com.adswizz.controller.RequestBody
com.adswizz.domain.dto.PersonDTO person) throws com.adswizz.service.exception.ServiceException {
    com.adswizz.controller.PersonController.LOGGER.debug(((("insert person: " + (person.getId())) + " ") + (person.getName())));
    return new org.springframework.http.ResponseEntity(personService.save(person), org.springframework.http.HttpStatus.OK);
}