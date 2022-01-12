public void disconnect() {
    textFrame.setVisible(false);
    activitystreamer.util.Message msg = new activitystreamer.util.Message("LOGOUT");
    connections.get(0).writeMsg(gson.toJson(msg));
    connections.get(0).closeCon();
}