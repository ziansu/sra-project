public void setConfiguration(long flags, net.minecraft.entity.player.EntityPlayerMP changer) {
    unregisterLabel();
    super.setConfiguration(flags, changer);
    flags = flags >> 3;
    Label = ((int) (flags & 65535L));
    if ((flags & (1 << (Buttons.PRIVATE.ordinal()))) != 0) {
        Player = changer.getDisplayName();
    }else {
        Player = "";
    }
    registerLabel();
}