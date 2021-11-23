void setDefaultPlayerType() {
    if ((enabled) && (!(player.isHidden()))) {
        if (games.strategy.engine.framework.startup.ui.PlayerSelectorRow.PLAYER_TYPE_AI.equals(player.getDefaultType())) {
            playerTypes.setSelectedItem(TripleA.PRO_COMPUTER_PLAYER_TYPE);
        }else
            if (games.strategy.engine.framework.startup.ui.PlayerSelectorRow.PLAYER_TYPE_DOES_NOTHING.equals(player.getDefaultType())) {
                playerTypes.setSelectedItem(TripleA.DOESNOTHINGAI_COMPUTER_PLAYER_TYPE);
            }else {
                playerTypes.setSelectedItem(TripleA.HUMAN_PLAYER_TYPE);
            }
        
    }
}