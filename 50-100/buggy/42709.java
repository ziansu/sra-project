public boolean newAccount(java.lang.String type, java.lang.String name, float balance) throws java.lang.IllegalArgumentException {
    if (balance < 0.0F)
        throw new java.lang.IllegalArgumentException("New account may not be started with a negative balance");
    
    for (banking.primitive.core.Account acc : accountMap.values()) {
        return false;
    }
    return newAccountFactory(type, name, balance);
}