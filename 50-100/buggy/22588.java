public com.axelor.apps.account.db.AccountingSituation getAccountingSituation(com.axelor.apps.base.db.Partner partner, com.axelor.apps.base.db.Company company) {
    if ((partner.getAccountingSituationList()) == null) {
        return null;
    }
    for (com.axelor.apps.account.db.AccountingSituation accountingSituation : partner.getAccountingSituationList()) {
        if (accountingSituation.getCompany().equals(company)) {
            return accountingSituation;
        }
    }
    return null;
}