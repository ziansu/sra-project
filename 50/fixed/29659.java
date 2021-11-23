public boolean shouldGetImmuneFeedback(java.lang.String[] type) {
    if (isImmune())
        return true;
    
    if (currentRole.isVesting())
        return true;
    
    return false;
}