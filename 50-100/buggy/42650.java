public static void sendSecurityMessage(net.md_5.bungee.api.connection.ProxiedPlayer player, java.lang.String rawMessage) {
    org.json.JSONObject message = new org.json.JSONObject();
    message.put("extra", new org.json.JSONArray());
    message.getJSONArray("extra").put(((me.shawlaf.bungeesecurity.BungeeSecurity.MESSAGE_HEADER) + rawMessage));
    message.put("text", "");
    message.put("bungeeSecurity", true);
    player.unsafe().sendPacket(new net.md_5.bungee.protocol.packet.Chat(message.toString(0)));
}