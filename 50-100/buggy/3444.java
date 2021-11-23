@org.spongepowered.api.event.Listener
public void onServerStopping(org.spongepowered.api.event.game.state.GameStoppedServerEvent event) {
    try {
        java.lang.String json = com.dracade.ember.Ember.serializer().gson().toJson(io.github.hsyyid.ultimategames.UltimateGames.arenas);
        io.github.hsyyid.ultimategames.utils.ConfigManager.writeJSON(json);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        getLogger().error("There was an issue while saving the arenas!");
    }
    getLogger().info("UltimateGames disabled.");
}