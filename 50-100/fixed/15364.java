public void setNoPurgePlayers(java.util.List<java.lang.String> no_pp) {
    no_pp.forEach(( name) -> {
        java.util.UUID uuid = com.alternacraft.pvptitles.Libraries.UUIDFetcher.getUUIDPlayer(name);
        if ((uuid != null) && (!(this.noPurgePlayers.contains(uuid.toString()))))
            this.noPurgePlayers.add(uuid.toString());
        
    });
}