@java.lang.Override
public void actionChoiceMade(org.smartreaction.starrealms.model.players.Player player, int choice) {
    if (choice == 1) {
        player.getGame().gameLog("Chose Add 2 Trade");
        player.addTrade(2);
    }else
        if (choice == 2) {
            player.getGame().gameLog("Chose Add 4 Combat");
            player.addCombat(4);
        }
    
}