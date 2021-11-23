private boolean checkBankAccountsExists() {
    org.egov.commons.Bankbranch branch = null;
    if ((id) != null) {
        branch = ((org.egov.commons.Bankbranch) (persistenceService.find("from Bankbranch where id=?", id)));
    }
    return (branch != null) && (branch.isAccountsExist());
}