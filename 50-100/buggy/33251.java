private boolean isWon(Player user) {
    for (java.util.Map.Entry<java.lang.String, Territory> entry : territories.entrySet()) {
        Territory territory = entry.getValue();
        if ((territory.owned_by) == user) {
            return false;
        }
    }
    return true;
}