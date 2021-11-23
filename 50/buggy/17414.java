@java.lang.Override
public void run() {
    milkAdminInstance.WL.updateLists(players, true);
    setWhiteListedPlayersAsList(players);
}