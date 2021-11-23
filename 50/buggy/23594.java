public com.docdoku.core.common.Organization getOrganizationOfCurrentUser() throws com.docdoku.server.rest.AccountNotFoundException {
    com.docdoku.core.common.Account account = accountManager.getMyAccount();
    return organizationManager.getOrganizationOfAccount(account.getLogin());
}