@ru.timurnav.controller.RequestMapping(method = RequestMethod.POST, consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
@org.springframework.core.annotation.Order
public java.util.concurrent.Callable<org.springframework.http.ResponseEntity> create(@ru.timurnav.controller.RequestBody
ru.timurnav.domain.User user) {
    return () -> {
        try {
            ru.timurnav.domain.User u = userRepository.save(user);
            return new org.springframework.http.ResponseEntity(u.getId(), org.springframework.http.HttpStatus.CREATED);
        } catch (java.lang.Exception e) {
            ru.timurnav.controller.UserController.LOG.error(("abort creating new user. Cause " + (e.getMessage())));
            return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR);
        }
    };
}