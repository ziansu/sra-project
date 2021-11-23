public static models.Player updatePlayer(models.Player p) {
    java.lang.System.out.println(("Name Update: " + (p.getName())));
    return helper.dbHandlers.PlayerDB.getInstance().updatePlayer(p);
}