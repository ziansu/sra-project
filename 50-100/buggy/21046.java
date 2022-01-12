public ninja.Result authorizeUser(@ninja.params.Param(value = "fingerprint")
java.lang.String fingerprint, @ninja.params.Param(value = "message")
java.lang.String message, ninja.session.FlashScope flashScope) {
    ai.subut.kurjun.model.identity.User user = identityManagerService.authenticateUser(fingerprint, message);
    if (user != null) {
        return ninja.Results.ok().render(user.getUserToken().getFullToken()).json();
    }else {
        return ninja.Results.internalServerError();
    }
}