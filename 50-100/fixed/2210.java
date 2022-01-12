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
    }
    return amount;
}