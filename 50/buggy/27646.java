public static void leaveGame() {
    org.json.simple.JSONObject jsonObject = new org.json.simple.JSONObject();
    jsonObject.put("method", "leave");
    Client.tcpClient.send(jsonObject.toString());
}