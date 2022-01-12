public void initConnection() {
    game.net.connection_encryption.ConnectionEncrypter.init(new game.net.connection_encryption.SymmetricKeyGenerator());
    game.net.communication.RequestMaker requestMaker = UserData.DATA.getRequestMaker();
    org.json.JSONObject request = requestMaker.getNewRequest(new game.net.communication.JSONd(game.net.fieldsnames.ServicesFields.SERVICE, game.net.fieldsnames.ServicesFields.ENCRYPT), new game.net.communication.JSONd(game.net.fieldsnames.ServicesFields.SERVICE_TYPE, game.net.fieldsnames.EncryptFields.PUBLIC_KEY_REQUEST));
    try {
        game.net.communication.ServerCommunicationThread.getInstance().send(request);
    } catch (game.net.communication.NotConnectedException e) {
        e.printStackTrace();
    }
}