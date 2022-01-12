protected org.json.JSONObject tellPlayer(int playerNum, org.json.JSONObject msg) throws org.json.JSONException {
    boolean needReply = msg.getBoolean("requestResponse");
    if (!needReply) {
        communicate(playerNum, msg.toString(), false);
        return null;
    }
    return communicate(playerNum, msg.toString(), true);
}