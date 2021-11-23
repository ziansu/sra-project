private void delete(Transaction transaction) {
    int index = userAccounts.getIndex(transaction.getNumber());
    User currentUser = userAccounts.removeUser(index);
    userAccounts.updateUser(index, currentUser);
}