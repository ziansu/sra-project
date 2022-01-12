private static com.goat.thirsty_goat.models.User.AccountType getAccountTypeFromString(java.lang.String accountTypeString) {
    for (com.goat.thirsty_goat.models.User.AccountType type : com.goat.thirsty_goat.models.User.AccountType.values()) {
        if (type.toString().equals(accountTypeString)) {
            return type;
        }
    }
    return com.goat.thirsty_goat.models.User.AccountType.BASICUSER;
}