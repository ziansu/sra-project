@java.lang.Override
public java.util.List<de.fau.amos.virtualledger.server.banking.model.BankAccountBankingModel> getBankAccounts(java.lang.String userId, java.lang.String bankingAccessId) throws de.fau.amos.virtualledger.server.banking.model.BankingException {
    if (!(dummyBankAccessEndpoint.existsBankAccess(bankingAccessId))) {
        throw new de.fau.amos.virtualledger.server.banking.model.BankingException("Dummy found no existing BankAccess for Operation getBankAccounts!");
    }
    if (!(bankAccountMap.containsKey(bankingAccessId))) {
        this.generateDummyBankAccountModels(bankingAccessId);
    }
    return bankAccountMap.get(bankingAccessId);
}