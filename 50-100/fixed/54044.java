public ninja.Result createUser(@ninja.params.Param(value = "key")
java.lang.String publicKey, ninja.session.FlashScope flashScope) {
    ai.subut.kurjun.model.identity.User user = identityManagerService.addUser(publicKey);
    if (user != null) {
        flashScope.success("User created successfully");
        return ninja.Results.redirect("/users");
    }else {
        flashScope.error("Failed to create user.");
        return ninja.Results.redirect("/users");
    }
}