@za.org.grassroot.webapp.controller.rest.RequestMapping(value = "/register/{phoneNumber}/{code}", method = RequestMethod.POST)
public org.springframework.http.ResponseEntity<za.org.grassroot.webapp.model.rest.ResponseWrappers.ResponseWrapper> createGroup(@za.org.grassroot.webapp.controller.rest.PathVariable(value = "phoneNumber")
java.lang.String phoneNumber, @za.org.grassroot.webapp.controller.rest.PathVariable(value = "code")
java.lang.String code, @za.org.grassroot.webapp.controller.rest.RequestParam(value = "registration_id")
java.lang.String registrationId) {
    za.org.grassroot.core.domain.User user = userManagementService.loadOrSaveUser(phoneNumber);
    gcmService.registerUser(user, registrationId);
    return new org.springframework.http.ResponseEntity(new za.org.grassroot.webapp.model.rest.ResponseWrappers.ResponseWrapperImpl(org.springframework.http.HttpStatus.CREATED, za.org.grassroot.webapp.enums.RestMessage.REGISTERED_FOR_PUSH, za.org.grassroot.webapp.enums.RestStatus.SUCCESS), org.springframework.http.HttpStatus.CREATED);
}