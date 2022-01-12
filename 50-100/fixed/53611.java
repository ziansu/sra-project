public com.dd.Player getActivePlayer() {
    if ((playerType) == (PlayerType.FIGHTER)) {
        return ((com.dd.Fighter) (activeFighter));
    }else
        if ((playerType) == (PlayerType.WIZARD)) {
            return ((com.dd.Wizard) (activeWizard));
        }else {
            return new com.dd.Player();
        }
    
}