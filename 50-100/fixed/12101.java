@java.lang.Override
public void loadNBTData(net.minecraft.nbt.NBTTagCompound compound) {
    net.minecraft.nbt.NBTTagCompound properties = ((net.minecraft.nbt.NBTTagCompound) (compound.getTag(com.lothrazar.samscontent.common.PlayerPowerups.EXT_PROP_NAME)));
    if (properties == null) {
        properties = new net.minecraft.nbt.NBTTagCompound();
    }
    this.player.getDataWatcher().updateObject(com.lothrazar.samscontent.common.PlayerPowerups.WAYPOINT_WATCHER, properties.getString(com.lothrazar.samscontent.common.PlayerPowerups.NBT_WAYPOINT));
    this.player.getDataWatcher().updateObject(com.lothrazar.samscontent.common.PlayerPowerups.TODO_WATCHER, properties.getString(com.lothrazar.samscontent.common.PlayerPowerups.NBT_TODO));
}