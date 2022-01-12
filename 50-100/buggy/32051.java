@java.lang.Override
public void actionChoiceMade(org.smartreaction.starrealms.model.players.Player player, int choice) {
    player.getGame().gameLog("Chose Add 3 Trade");
    if (choice == 1) {
        player.addTrade(3);
    }else
        if (choice == 2) {
            player.getGame().gameLog("Chose Add 5 Combat");
            player.addCombat(5);
        }
    
}