private api.Player getById(java.lang.String aId) {
    for (api.Player p : iPlayers) {
        if (p.getId().equals(aId)) {
            return p;
        }
    }
    return null;
}