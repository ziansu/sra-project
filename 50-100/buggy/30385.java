public void changePassword(final com.feth.play.module.pa.providers.password.UsernamePasswordAuthUser authUser, final boolean create) {
    models.LinkedAccount link = getAccountByProvider(authUser.getProvider());
    if (link == null) {
        if (create) {
            link = models.LinkedAccount.create(authUser);
            link.user = this;
        }else {
            throw new java.lang.RuntimeException("Account not enabled for password usage.");
        }
        link.providerUserId = authUser.getHashedPassword();
        link.save();
    }
}