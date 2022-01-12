private boolean strike() {
    if ((strikes) >= (bwyap.familyfeud.game.FamilyFeudGame.STRIKE_LIMIT)) {
        bwyap.utility.logging.Logger.err("Strike limit reached: other family should be given the chance to steal.");
        return false;
    }else {
        (strikes)++;
        bwyap.utility.logging.Logger.log((((("Family [" + (selectedFamilyIndex)) + "] now has ") + (strikes)) + " strike(s)."));
        return true;
    }
}