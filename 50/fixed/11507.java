public void userJoined(connection.MessageTO mTo) {
    service.ServerService.frontController.userJoined(mTo.getFrom(), mTo.getRoom(), ((java.util.List<java.lang.String>) (mTo.getBody())));
}