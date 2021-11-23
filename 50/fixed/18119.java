public boolean validate(Account r) {
    for (Account i : Accounts) {
        if ((r.account) == (i.account)) {
            return (r.pin) == (i.pin);
        }
    }
    return false;
}