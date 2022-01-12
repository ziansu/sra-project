public java.lang.String openAccount(client.Bank bank) {
    if ((bank.getClass()) == (client.KBBank.class))
        return KBBankAccountNumber = bank.openAccount(name);
    else
        if ((bank.getClass()) == (client.NHBank.class))
            return NHBankAccountNumber = bank.openAccount(name);
        else
            return WooriBankAccountNumber = bank.openAccount(name);
        
    
}