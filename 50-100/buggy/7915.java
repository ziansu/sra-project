public java.lang.String authenticate(java.lang.String input, java.util.List<pekl.gasqueue.com.gasqueue.model.Authenticator> authenticatorList) {
    clientType = "empty";
    for (pekl.gasqueue.com.gasqueue.model.Authenticator authPassword : authenticatorList) {
        if (input.equals(authPassword.getBarPassword())) {
            clientType = "bar";
        }else
            if (input.equals(authPassword.getCustomerPassword())) {
                clientType = "customer";
            }else
                clientType = "empty";
            
        
    }
    return clientType;
}