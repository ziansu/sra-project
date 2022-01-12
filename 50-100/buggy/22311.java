@java.lang.Override
public void onMessage(org.java_websocket.WebSocket conn, java.lang.String message) {
    this.sendToAll(message);
    java.lang.System.out.println(((conn + ": ") + message));
    server.JSONReader reader = new server.JSONReader<client.smrtms.com.smrtms_client.tokens.Token>();
    client.smrtms.com.smrtms_client.tokens.Token t = ((client.smrtms.com.smrtms_client.tokens.Token) (reader.readJson(message, client.smrtms.com.smrtms_client.tokens.Token.class)));
    java.lang.System.out.println(("Recieved Token tag: " + (t.sTag)));
    ParseToken(t);
}