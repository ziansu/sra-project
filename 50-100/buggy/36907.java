@org.eclipse.jetty.websocket.api.annotations.OnWebSocketMessage
public void onMessage(org.eclipse.jetty.websocket.api.Session session, java.lang.String message) {
    try {
        io.infectnet.server.controller.websocket.SocketMessage socketMessage = getMessage(message);
        io.infectnet.server.controller.websocket.Action action = socketMessage.getAction();
        if (action == (Action.AUTH)) {
            sessionAuthenticator.authenticate(session, socketMessage);
        }
        io.infectnet.server.controller.websocket.handler.OnMessageHandler handler = onMessageHandlerMap.get(action);
        handler.handle(session, socketMessage.getArguments());
    } catch (io.infectnet.server.controller.exception.MalformedMessageException e) {
    } catch (io.infectnet.server.controller.exception.AuthenticationFailedException e) {
    }
}