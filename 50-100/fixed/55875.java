@java.lang.Override
public void call(java.lang.Object... args) {
    java.lang.System.out.println("playerLeftRoomInLobby");
    for (java.lang.Character character : characters) {
        character.setReady(false);
    }
    try {
        removeCharacter(((org.json.JSONObject) (args[0])).getJSONObject("character").getInt("id"));
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    endLobbyCountdownTimer();
    refreshLobby();
}