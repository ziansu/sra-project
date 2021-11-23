@java.lang.Override
public void save() {
    if (saveToggle) {
        java.util.ArrayList<java.lang.String> uuids = new java.util.ArrayList<>();
        for (java.util.UUID player : excludedPlayers) {
            uuids.add(player.toString());
        }
        config.set("excludedPlayers", uuids);
    }
    super.save();
}