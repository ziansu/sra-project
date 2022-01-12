public static play.mvc.Result resetPassword(final java.lang.String token) {
    com.feth.play.module.pa.controllers.Authenticate.noCache(response());
    final models.TokenAction ta = controllers.Users.tokenIsValid(token, Type.PASSWORD_RESET);
    if (ta == null) {
        return badRequest(no_token_or_invalid.render());
    }
    return ok(password_reset.render(controllers.Users.PASSWORD_RESET_FORM.fill(new controllers.Users.PasswordReset(token))));
}