public static models.Player updatePlayer(models.Player p) {
    return helper.dbHandlers.PlayerDB.getInstance().updatePlayer(p);
}