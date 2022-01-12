boolean singleTapAttack(java.lang.String[] ad) {
    Config.runFlaskSuppression = true;
    long tapTime = 400;
    if (soakAttack(ad))
        return false;
    
    if (((ui.modmouse()) != 2) && ((ui.modflags()) != 1)) {
        wdgmsg("act", ((java.lang.Object[]) (ad)));
        if ((ui.fight) != null) {
            multiHotkeyFix = true;
            ui.fight.attackCurrent();
        }
        return true;
    }
    return false;
}