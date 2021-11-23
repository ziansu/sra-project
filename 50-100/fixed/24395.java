public static boolean isPlayerOwner(net.minecraft.entity.player.EntityPlayer player, openmodularturrets.tileentity.turretbase.TurretBase base) {
    return (base.getOwner().equals(player.getUniqueID().toString())) || ((openmodularturrets.handler.ConfigHandler.offlineModeSupport) && (base.getOwner().equals(player.getDisplayName())));
}