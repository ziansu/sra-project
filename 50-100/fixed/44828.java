private void selectStealFamily(int index) {
    if ((strikes) == (bwyap.familyfeud.game.FamilyFeudGame.STRIKE_LIMIT)) {
        selectedFamilyIndex = index;
        bwyap.utility.logging.Logger.log((("Family [" + (selectedFamilyIndex)) + "] selected as potential stealers."));
    }else
        bwyap.utility.logging.Logger.err((((("Cannot assign family [" + index) + "] as stealers: ") + ((bwyap.familyfeud.game.FamilyFeudGame.STRIKE_LIMIT) - (strikes))) + " strike(s) remaining"));
    
}