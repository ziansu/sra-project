public void userJoined(connection.MessageTO mTo) {
    service.ServerService.frontController.userJoined(mTo.getFrom(), mTo.getRoom(), ((service.List<java.lang.String>) (mTo.getBody())));
}