private com.google.gerrit.server.IdentifiedUser identifyUser(org.eclipse.jgit.lib.PersonIdent author) {
    try {
        com.google.gerrit.reviewdb.client.Account.Id id = accountManager.lookup(((com.google.gerrit.reviewdb.client.AccountExternalId.SCHEME_MAILTO) + (author.getEmailAddress())));
        if (id == null)
            id = accountManager.lookup(((com.google.gerrit.reviewdb.client.AccountExternalId.SCHEME_GERRIT) + (author.getEmailAddress().toLowerCase())));
        
        if (id == null)
            return null;
        
        return factory.create(id);
    } catch (com.google.gerrit.server.account.AccountException e) {
        return null;
    }
}