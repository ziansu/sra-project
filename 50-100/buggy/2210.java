public int GetTerritoryAmount(data.Territory.Player player) {
    int amount = 0;
    if (owned) {
        amount = enforcementValue;
    }else {
        for (data.Territory t : continentTerritorys) {
            if ((t.CheckOwner()) == player) {
                amount++;
            }
        }
        if (amount == (enforcementValue)) {
            owned = true;
            owner = player;
        }else
            if ((enforcementValue) > 0) {
                owned = false;
                owner = Territory.Player.NONE;
            }
        
    }
    return amount;
}