public void update() {
    cn.nukkit.network.protocol.AdventureSettingsPacket pk = new cn.nukkit.network.protocol.AdventureSettingsPacket();
    pk.flags = 0;
    pk.worldImmutable = !(canDestroyBlock);
    pk.autoJump = autoJump;
    pk.allowFlight = canFly;
    pk.noClip = noclip;
    pk.isFlying = flying;
    pk.noPvp = noPvp;
    pk.noPvm = noPvm;
    pk.noMvp = noMvp;
    pk.muted = muted;
    pk.userPermission = 0;
    player.dataPacket(pk);
    player.resetInAirTicks();
}