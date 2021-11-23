@sample.RequestMapping(path = "api/signup", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
public org.springframework.http.ResponseEntity register(@sample.RequestBody
sample.AuthorizationCredentials credentials, javax.servlet.http.HttpSession httpSession) {
    logger.debug("/signup called with login: {}", credentials.getLogin());
    final sample.ErrorResponse sessionError = sample.auth.utils.RequestValidator.validateNotAuthorizedSession(httpSession);
    if (sessionError != null) {
        return buildErrorResponse(sessionError);
    }
    final java.util.List<sample.ErrorResponse> registrationError = accountService.register(credentials);
    if (!(registrationError.isEmpty())) {
        return buildErrorResponse(registrationError);
    }
    return org.springframework.http.ResponseEntity.ok(new sample.SuccessResponseMessage("Successfully registered user"));
}