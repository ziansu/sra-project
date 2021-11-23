@java.lang.Override
public void run() {
    if ((milkAdminInstance.WL) != null) {
        milkAdminInstance.WL.updateLists(players);
        setWhiteListedPlayersAsList(players);
    }
}