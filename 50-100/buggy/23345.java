public void create(banksys.account.AbstractAccount account) throws banksys.persistence.exception.AccountCreationException {
    if ((this.findAccount(account.getNumber())) != null) {
        this.accounts.addElement(account);
    }else {
        throw new banksys.persistence.exception.AccountCreationException("OrdinaryAccount alredy exist!", account.getNumber());
    }
}