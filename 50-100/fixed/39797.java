private void voting_sucessf() {
    if (checkGameEnds(null, false))
        return ;
    
    election_tracker = 0;
    setElectionTracker();
    sendMessage((((ChatColor.BLUE.toString()) + (org.bukkit.ChatColor.BOLD)) + (Main.i.saves.config.getString("tr.game.presd_draws"))));
    de.robfro.secrethitler.game.Card[] cards = deck.getThreeCards(this);
    giveGamerCards(president, cards);
    gamestate = 2;
    president.sendMessage(((org.bukkit.ChatColor.BLUE) + (Main.i.saves.config.getString("tr.game.presd_discard"))));
}