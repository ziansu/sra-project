@java.lang.Override
public void execute() throws server.ServerException {
    java.lang.System.out.println("execute register");
    this.response = this.getFacade().register(this.getCredentials());
}