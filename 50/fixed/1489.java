public void loggedIn(connection.MessageTO mTo) {
    service.ServerService.frontController.loggedIn(((java.util.List<java.lang.String>) (mTo.getBody())), mTo.getType());
}