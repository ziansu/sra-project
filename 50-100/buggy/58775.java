@sample.RequestMapping(path = "/api/user", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
public org.springframework.http.ResponseEntity changePassword(@sample.RequestBody
sample.ChangePasswordCredentials credentials, javax.servlet.http.HttpSession httpSession) {
    logger.debug("/user-change-pass called");
    final sample.ErrorResponse sessionError = sample.auth.utils.RequestValidator.validateAlreadyAuthorizedSession(httpSession);
    if (sessionError != null) {
        return buildErrorResponse(sessionError);
    }
    final java.util.List<sample.ErrorResponse> passwordChangeErrors = accountService.changePassword(credentials);
    if (passwordChangeErrors != null) {
        return buildErrorResponse(passwordChangeErrors);
    }
    return org.springframework.http.ResponseEntity.ok(new sample.SuccessResponseMessage(("Successfully changed password for user " + (credentials.getLogin()))));
}