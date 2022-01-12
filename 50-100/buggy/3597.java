private void ConnectionRequest(pp2016.team19.server.engine.Message message) {
    java.lang.System.out.println("Connected");
    pp2016.team19.server.engine.Message answer = ((pp2016.team19.server.engine.MessSignInAndUpAnswer) (new pp2016.team19.server.engine.MessSignInAndUpAnswer(false, 0, 3)));
    try {
        this.messagesToClient.put(new pp2016.team19.server.engine.MessSignInAndUpAnswer(false, 0, 3));
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}