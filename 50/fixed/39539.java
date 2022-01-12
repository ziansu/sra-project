@java.lang.Override
public void run() {
    if ((milkAdminInstance.WL) != null) {
        milkAdminInstance.WL.myAddDefaultPlayer(player);
        addWhiteListedPlayersAsList(player);
    }
}