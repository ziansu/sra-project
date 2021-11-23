@java.lang.Override
public void execute() throws server.ServerException {
    this.response = this.getFacade().register(this.getCredentials());
}