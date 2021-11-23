protected void onPostExecute(java.lang.String result) {
    try {
        org.json.JSONObject jsonObject = new org.json.JSONObject(result);
        java.util.Map<java.lang.String, java.lang.Object> map = com.nuvoton.socketmanager.HTTPSocketManager.toMap(jsonObject);
        map.put("tag", tag);
        httpSocketInterface.httpSocketResponse(map);
        httpSocketInterface.didDisconnected();
        if (isTwoWayTalking) {
            httpSocketInterface.voiceConnectionOpened();
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}