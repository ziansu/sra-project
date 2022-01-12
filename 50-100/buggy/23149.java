private void arenaBegin(java.lang.String arenaType, int arenaNumber) {
    eventActive = "arena";
    arenaActive = new com.gabezter4.Vitals.Arena(this, arenaType, arenaNumber);
    if (((arenaActive.event.equals("HungerGames")) && (enabled("arena_hungergamesregionrestore"))) && (new java.io.File(getDataFolder(), "regionrestore_hungergames1.yml").exists())) {
        regionrestore(null, "hungergames1");
        debug("[arena] hungergames1 region was restored");
    }
}