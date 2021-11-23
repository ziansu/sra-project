public void transfer(ua.yandex.bank.Account from, ua.yandex.bank.Account to, int amount) throws java.lang.IllegalArgumentException {
    from.withdraw(amount);
    to.deposit(amount);
}