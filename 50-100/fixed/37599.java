void updatePlayers(java.util.ArrayList<Player> players) {
    java.util.HashMap<java.lang.String, java.lang.Object> message = new java.util.HashMap<>();
    java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
    for (Player player : players) {
        arrayList.add(player.getPlayerName());
    }
    message.put("llist", arrayList);
    messageProvider.sendMessage(new org.json.simple.JSONObject(message));
}