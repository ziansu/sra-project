@com.insys.trapps.controllers.PostMapping(value = "/person/email/exists")
public org.springframework.http.ResponseEntity<java.lang.Boolean> getInterview(@com.insys.trapps.controllers.RequestBody
com.insys.trapps.model.person.Person person) {
    java.lang.Boolean exists = java.lang.Boolean.FALSE;
    com.insys.trapps.model.person.Person existingPerson = personService.findByEmail(person.getEmail());
    if ((person.getId()) != null) {
        if (existingPerson != null) {
            if (!(existingPerson.getId().equals(person.getId()))) {
                exists = java.lang.Boolean.TRUE;
            }
        }
    }
    return org.springframework.http.ResponseEntity.status(HttpStatus.OK).body(exists);
}