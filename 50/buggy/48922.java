public void setUserAccountValue(java.lang.String account) {
    java.lang.System.out.println(("Model is changing mail name to" + account));
    userEmailAccount = account;
    setChanged();
    notifyObservers(account);
}