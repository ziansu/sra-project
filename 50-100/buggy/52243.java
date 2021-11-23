public void openAccount(client.Bank bank) {
    if ((bank.getClass()) == (client.KBBank.class))
        KBBankAccountNumber = bank.openAccount(name);
    else
        if ((bank.getClass()) == (client.NHBank.class))
            NHBankAccountNumber = bank.openAccount(name);
        else
            if ((bank.getClass()) == (client.NHBank.class))
                WooriBankAccountNumber = bank.openAccount(name);
            
        
    
}