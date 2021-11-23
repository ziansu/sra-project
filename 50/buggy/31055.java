public void addRefreshAccounts(com.superkeychain.keychain.entity.Account account) {
    if ((account != null) && ((adapter) != null)) {
        this.accounts.add(0, account);
        adapter.notifyDataSetChanged();
    }
}