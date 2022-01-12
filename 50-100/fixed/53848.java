private synchronized com.bank.rmi.Response checkBalance(com.bank.rmi.GetBalanceRequest clientRequest) {
    com.bank.rmi.BalanceResponse response = null;
    if (com.bank.rmi.RmiBankServerImpl.accounts.containsKey(clientRequest.getUid())) {
        response = new com.bank.rmi.BalanceResponse(com.bank.rmi.RmiBankServerImpl.accounts.get(clientRequest.getUid()).balance);
    }
    return response;
}