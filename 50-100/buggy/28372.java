@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public activitystreamer.server.Connection outgoingConnection(java.net.Socket s) throws java.io.IOException {
    activitystreamer.server.Connection con = super.outgoingConnection(s);
    org.json.simple.JSONObject serverMessage = new org.json.simple.JSONObject();
    serverMessage.put("command", "AUTHENTICATE");
    serverMessage.put("secret", activitystreamer.util.Settings.getSecret());
    con.writeMsg(serverMessage.toString());
    allServers.add(con);
    activitystreamer.server.ControlSolution.ServerAnnounce sa = new activitystreamer.server.ControlSolution.ServerAnnounce(con, activitystreamer.util.Settings.getSecret(), 0, "", 0);
    serverAnnounces.add(sa);
    return con;
}