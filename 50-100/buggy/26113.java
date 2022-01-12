private void initCBAccs() {
    java.util.List accItems = this.fh.getAccounts(this.paths.getAccounts());
    if (accItems != null) {
        for (int i = 0; i < (accItems.size()); ++i) {
            updated.AccountItem toAdd = new updated.AccountItem((i + 1), ((updated.Account) (accItems.get(i))));
            this.cbAcc.addItem(toAdd);
            this.cbChooseAcc.addItem(toAdd);
        }
    }
}