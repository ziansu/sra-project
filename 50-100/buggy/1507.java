private boolean validPlacement(player.Hex h1, player.Hex h2, player.Hex h3) {
    if (hexManager.validTileHexes(hex1, hex2, hex3)) {
        if (!((ourSettlements.isCovered(h1, h2, h3)) || (theirSettlements.isCovered(h1, h2, h3))))
            return true;
        else
            return false;
        
    }else
        return false;
    
}