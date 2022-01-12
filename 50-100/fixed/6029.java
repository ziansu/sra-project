public static java.util.Set<org.votingsystem.dto.currency.CurrencyDto> getWallet(java.lang.String pin) throws java.lang.Exception {
    byte[] walletBytes = org.votingsystem.util.Wallet.getWalletBytes(pin);
    if (walletBytes == null)
        return new java.util.HashSet<>();
    else
        return org.votingsystem.util.JSON.readValue(walletBytes, new com.fasterxml.jackson.core.type.TypeReference<java.util.Set<org.votingsystem.dto.currency.CurrencyDto>>() {        });
    
}