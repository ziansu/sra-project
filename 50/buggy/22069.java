public static boolean setID(java.lang.String id) {
    if ((com.mycompany.steamachievementtracker.SteamHandler.selected) != null) {
        com.mycompany.steamachievementtracker.SteamHandler.selected.haltThreads();
    }
    com.mycompany.steamachievementtracker.SteamHandler.selected = new com.mycompany.steamachievementtracker.Account(id, false);
    return true;
}