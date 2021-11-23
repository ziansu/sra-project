@java.lang.Override
public void onDeath(net.minecraft.util.DamageSource cause) {
    super.onDeath(cause);
    if (!(this.worldObj.isRemote)) {
        ckhbox.villagebox.common.village.home.DataVillage.get(this.worldObj).addDeadVillager(this);
        net.minecraft.server.MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new net.minecraft.util.ChatComponentTranslation(ckhbox.villagebox.common.util.helper.PathHelper.full("message.villager.died"), this.getName()));
    }
}