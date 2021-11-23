public com.axelor.apps.account.db.Account getInternalBankToBankAccount(com.axelor.apps.account.db.AccountConfig accountConfig) throws com.axelor.exception.AxelorException {
    if ((accountConfig.getInternalBankToBankAccount()) == null) {
        throw new com.axelor.exception.AxelorException(java.lang.String.format(com.axelor.i18n.I18n.get(IExceptionMessage.ACCOUNT_CONFIG_INTERNAL_BANK_TO_BANK_ACCOUNT), GeneralServiceImpl.EXCEPTION, accountConfig.getCompany().getName()), com.axelor.exception.db.IException.CONFIGURATION_ERROR);
    }
    return accountConfig.getInternalBankToBankAccount();
}