public void loadVoteSites() {
    com.Ben12345rocks.VotingPlugin.Main.configVoteSites.setup();
    voteSites = java.util.Collections.synchronizedList(new java.util.ArrayList<com.Ben12345rocks.VotingPlugin.Objects.VoteSite>());
    voteSites.addAll(com.Ben12345rocks.VotingPlugin.Main.configVoteSites.getVoteSitesLoad());
    if ((voteSites.size()) == 0) {
        com.Ben12345rocks.VotingPlugin.Main.plugin.getLogger().warning("Detected no voting sites, this may mean something isn't properly setup");
    }
    com.Ben12345rocks.VotingPlugin.Main.plugin.debug("Loaded VoteSites");
}