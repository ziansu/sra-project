public void setAccount(limeng32.mirage.account.persist.Account newAccount) {
    if (((this.account) == null) || (!(this.account.equals(newAccount)))) {
        if ((this.account) != null) {
            limeng32.mirage.account.persist.Account oldAccount = this.account;
            this.account = null;
            oldAccount.removeStory(this);
        }
        if (newAccount != null) {
            this.account = newAccount;
            this.account.addStory(this);
        }
    }
}