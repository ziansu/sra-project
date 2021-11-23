@com.adswizz.controller.RequestMapping(value = "{id}", method = RequestMethod.PUT)
public org.springframework.http.ResponseEntity update(@com.adswizz.controller.RequestBody
com.adswizz.domain.dto.PersonDTO personDTO) {
    try {
        com.adswizz.controller.PersonController.LOGGER.debug(((("update person by ID: " + (personDTO.getId())) + " new name: ") + (personDTO.getName())));
        return new org.springframework.http.ResponseEntity(personService.update(personDTO), org.springframework.http.HttpStatus.OK);
    } catch (com.adswizz.service.exception.ServiceException e) {
        return new com.adswizz.exception.ServiceExceptionHandler().handleMiscFailures(e);
    } catch (java.lang.RuntimeException ex) {
        return new com.adswizz.exception.ServiceExceptionHandler().handleAnyException(ex);
    }
}