private boolean checkIfHasToSteal(java.lang.Integer lastBowl) {
    if (table.getContainerByIndex(lastBowl).isTray())
        return false;
    else
        if ((table.getContainerByIndex(lastBowl).getNumSeeds()) != 0)
            return false;
        else
            if (getActivePlayerId().equals(table.getPlayerIdByIndex(lastBowl)))
                return true;
            else
                return false;
            
        
    
}