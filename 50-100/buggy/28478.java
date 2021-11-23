public void onFreddyTPWaitEnd() {
    sendInfoToPlayer(freddy, org.bitbucket.ucchy.fnafim.Messages.get("Info_FreddyTeleportWaitEnd"));
    effectManager.removeEffect(freddy, BindEffect.TYPE);
    int speed = config.getMoveSpeed(night).getFreddy();
    if (speed != (-99)) {
        effectManager.applyEffect(freddy, new org.bitbucket.ucchy.fnafim.effect.SpeedEffect(freddy, speed));
    }else {
        freddyReturn = true;
    }
}