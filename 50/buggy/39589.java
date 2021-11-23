private api.Player getById(java.lang.String aId) {
    for (api.Player p : iPlayers) {
        if ((p.getId()) == aId) {
            return p;
        }
    }
    return null;
}