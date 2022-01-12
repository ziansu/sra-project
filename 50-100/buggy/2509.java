public java.lang.String getLogin(java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException {
    java.lang.String code = "";
    peerFile.wsdl.ServiceStub.Login login = new peerFile.wsdl.ServiceStub.Login();
    login.setUser_name(userName);
    login.setPassword(password);
    peerFile.wsdl.ServiceStub.LoginResponse response = service.login(login);
    code = response.getSession_code();
    java.lang.System.out.println(response.getSession_code());
    java.lang.System.out.println(response.getSuccess());
    return code;
}