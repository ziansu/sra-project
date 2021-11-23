boolean doubleTapAttack(java.lang.String[] ad) {
    Config.runFlaskSuppression = true;
    long tapTime = 400;
    if (((java.lang.System.currentTimeMillis()) - (doubleTapTime)) < tapTime) {
        multiHotkeyFix = true;
        if (soakAttack(ad))
            return false;
        
        wdgmsg("act", ((java.lang.Object[]) (ad)));
        if ((ui.fight) != null) {
            ui.fight.attackCurrent();
        }
        return true;
    }
    doubleTapTime = java.lang.System.currentTimeMillis();
    return false;
}