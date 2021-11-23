public boolean saveWhitelist(java.util.List<java.lang.String> players) {
    if ((milkAdminInstance) != null) {
        if ((milkAdminUpdateThreadC) == null) {
            milkAdminUpdateThreadC = new com.sectorgamer.sharkiller.milkAdmin.milkAdminUpdateThread(milkAdminInstance);
        }
        milkAdminUpdateThreadC.updateLists(players);
    }
    return true;
}