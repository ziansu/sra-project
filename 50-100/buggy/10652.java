@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST)
public com.github.visola.familymenu.model.Person createPerson(@org.springframework.web.bind.annotation.RequestBody
@javax.validation.Valid
com.github.visola.familymenu.model.Person person, @org.springframework.security.core.annotation.AuthenticationPrincipal
java.lang.String familyName) {
    com.github.visola.familymenu.model.Family loadedFamily = familyRepository.findByName(familyName);
    if ((person.getFamily()) != null) {
        if ((loadedFamily == null) || (!(java.util.Objects.equals(person.getFamily().getId(), loadedFamily.getId())))) {
            throw new com.github.visola.familymenu.controller.exception.NotAuthorizedException("You don't have permission to add a person to that family.");
        }
    }
    person.setFamily(loadedFamily);
    return personRepository.save(person);
}