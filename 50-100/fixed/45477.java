public java.util.List<com.gagror.data.account.ContactReferenceOutput> loadAccountsNotContacts() {
    log.debug("Loading non-contact accounts as contacts");
    final java.util.List<com.gagror.data.account.ContactReferenceOutput> output = new java.util.ArrayList<>();
    for (final com.gagror.data.account.AccountEntity account : accountRepository.findAll(new org.springframework.data.domain.Sort("name"))) {
        if (isNonContactAccount(account)) {
            output.add(new com.gagror.data.account.ContactReferenceOutput(account));
        }
    }
    return output;
}