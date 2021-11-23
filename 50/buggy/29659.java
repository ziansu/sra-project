public boolean shouldGetImmuneFeedback(java.lang.String[] type, shared.logic.Player killer) {
    if (isImmune())
        return true;
    
    if (currentRole.isVesting())
        return true;
    
    return false;
}