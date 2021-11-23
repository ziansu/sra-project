@java.lang.Override
public java.lang.String register(java.lang.String username, java.lang.String password) {
    return ClientModel.ClientFacade.getInstance().authenticate(new com.CommandClasses.Register(username, password));
}