@java.lang.Override
public void worldHasMoved() {
    java.util.List<plm.universe.Entity> l = currWorld.getEntities();
    for (plm.universe.Entity element : l) {
        if (element.isReadyToSend()) {
            server.parser.StreamMsg streamMsg = new server.parser.StreamMsg(currWorld, element.getOperations());
            org.json.simple.JSONObject message = streamMsg.result();
            element.getOperations().clear();
            element.setReadyToSend(false);
            send(message);
        }
    }
}