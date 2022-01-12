private synchronized com.bank.rmi.Response depositAmount(com.bank.rmi.DepositRequest clientRequest) {
    com.bank.rmi.DepositResponse response;
    if (com.bank.rmi.RmiBankServerImpl.accounts.containsKey(clientRequest.getUid())) {
        com.bank.rmi.RmiBankServerImpl.accounts.get(clientRequest.getUid()).balance += clientRequest.getAmount();
        response = new com.bank.rmi.DepositResponse("OK");
    }else
        response = new com.bank.rmi.DepositResponse("FAILED");
    
    return response;
}