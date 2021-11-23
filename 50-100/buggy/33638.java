public boolean useBase(org.smartreaction.starrealms.model.players.Player player) {
    if (baseCanBeUsed(player)) {
        if (!(isUsed())) {
            setUsed(true);
            baseUsed(player);
            return true;
        }else
            if (this.isAlliableCard()) {
                return player.useAlliedAbilities(((org.smartreaction.starrealms.model.cards.AlliableCard) (this)));
            }
        
    }
    return false;
}