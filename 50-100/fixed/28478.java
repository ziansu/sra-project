public void onFreddyTPWaitEnd(java.lang.String name, int speed) {
    sendInfoToPlayer(name, org.bitbucket.ucchy.fnafim.Messages.get("Info_FreddyTeleportWaitEnd"));
    effectManager.removeEffect(name, BindEffect.TYPE);
    if (speed != (-99)) {
        effectManager.applyEffect(name, new org.bitbucket.ucchy.fnafim.effect.SpeedEffect(name, speed));
    }else {
        freddyReturn = true;
    }
}