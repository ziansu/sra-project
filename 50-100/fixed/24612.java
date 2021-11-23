@com.netcracker.controller.PutMapping(produces = com.netcracker.controller.RegistrationController.JSON_MEDIA_TYPE, value = "/{personId}")
public org.springframework.http.ResponseEntity<com.netcracker.model.entity.Person> updatePerson(@com.netcracker.controller.PathVariable
java.lang.Long personId, @org.springframework.validation.annotation.Validated(value = com.netcracker.model.validation.CreateValidatorGroup.class)
@com.netcracker.controller.RequestBody
com.netcracker.model.dto.PersonDTO personDTO) throws com.netcracker.exception.CannotUpdatePersonException, com.netcracker.exception.ResourceNotFoundException, java.lang.IllegalAccessException {
    com.netcracker.model.entity.Person currentUser = personDTO.toPerson();
    currentUser.setId(personId);
    java.util.Optional<com.netcracker.model.entity.Person> person = personService.updatePerson(currentUser, personId);
    if (!(person.isPresent()))
        new org.springframework.http.ResponseEntity(currentUser, org.springframework.http.HttpStatus.BAD_REQUEST);
    
    return new org.springframework.http.ResponseEntity(currentUser, org.springframework.http.HttpStatus.OK);
}