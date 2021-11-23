private void attempPlay() {
    if (null == (mUsername))
        return ;
    
    if (!(mSocket.connected()))
        return ;
    
    org.json.JSONObject play = new org.json.JSONObject();
    try {
        play.put("room", mPosition);
        play.put("username", mUsername);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    mSocket.emit("play request", play);
}