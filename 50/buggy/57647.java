public Account withType(AccountTypeEnum value) {
    java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Account.class.getName());
    logger.info(("Value: " + (value.toString())));
    setType(value);
    return this;
}