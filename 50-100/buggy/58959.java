@com.adswizz.controller.RequestMapping(method = RequestMethod.POST)
public org.springframework.http.ResponseEntity create(@com.adswizz.controller.RequestBody
com.adswizz.domain.dto.PersonDTO person) {
    try {
        com.adswizz.controller.PersonController.LOGGER.debug(((("insert person: " + (person.getId())) + " ") + (person.getName())));
        return new org.springframework.http.ResponseEntity(personService.save(person), org.springframework.http.HttpStatus.OK);
    } catch (com.adswizz.service.exception.ServiceException e) {
        return new com.adswizz.exception.ServiceExceptionHandler().handleMiscFailures(e);
    } catch (java.lang.RuntimeException ex) {
        return new com.adswizz.exception.ServiceExceptionHandler().handleAnyException(ex);
    }
}