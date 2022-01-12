@java.lang.Override
public java.util.List<de.fau.amos.virtualledger.server.banking.model.BankAccountBankingModel> getBankAccounts(java.lang.String userId, java.lang.String bankingAccessId) throws de.fau.amos.virtualledger.server.banking.model.BankingException {
    if (!(dummyBankAccessEndpoint.existsBankAccess(bankingAccessId))) {
        return new java.util.ArrayList<de.fau.amos.virtualledger.server.banking.model.BankAccountBankingModel>();
    }
    if (!(bankAccountMap.containsKey(bankingAccessId))) {
        this.generateDummyBankAccountModels(bankingAccessId);
    }
    return bankAccountMap.get(bankingAccessId);
}