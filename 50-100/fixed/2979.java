private void startFayeClient() {
    fayeClient = new com.elirex.fayeclient.FayeClient(((((com.elirex.fayeclient.FayeService.SERVER_HOST) + ":") + (com.elirex.fayeclient.FayeService.SERVER_PORT)) + (com.elirex.fayeclient.FayeService.SERVER_PATH)), com.elirex.fayeclient.FayeService.AUTH_TOKEN, com.elirex.fayeclient.FayeService.ACCESS_TOKEN);
    fayeClient.setListener(fayeClientListener);
    fayeClient.connectToServer();
}