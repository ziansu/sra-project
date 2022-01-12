public static void doUserStuff() {
    boolean local = com.frysoft.notifry.data.User.isLocal();
    boolean online = com.frysoft.notifry.data.User.isOnline();
    if ((!local) && (!online)) {
        com.frysoft.notifry.data.User.logon();
    }
    if (com.frysoft.notifry.data.User.isOnline()) {
        com.frysoft.notifry.data.ConnectionManager.sync();
    }
}