public void onReady(play.mvc.WebSocket.In<java.lang.String> in, play.mvc.WebSocket.Out<java.lang.String> out) {
    if (gameUUID.equals("local")) {
        new models.GridObserver(controllers.Application.controller, out);
    }else {
        java.lang.System.out.println(("starting grid observer for" + gameUUID));
        controllers.Application.gameInstances.get(java.util.UUID.fromString(gameUUID)).setOut(out);
        new models.GridObserver(controllers.Application.gameInstances.get(java.util.UUID.fromString(gameUUID)).getController(), out);
    }
}