private void delete(Transaction transaction) {
    int index = userAccounts.getIndex(transaction.getNumber());
    userAccounts.removeUser(index);
}