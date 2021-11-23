@java.lang.Override
public void onEntityAdded(net.minecraft.entity.Entity entity) {
    if ((!(entity instanceof net.minecraft.entity.player.EntityPlayer)) && (this.dimension.hasSetting(SettingType.ENTITYSPAWN))) {
        de.alaoli.games.minecraft.mods.yadm.data.settings.EntitySpawnSetting setting = ((de.alaoli.games.minecraft.mods.yadm.data.settings.EntitySpawnSetting) (this.dimension.get(SettingType.ENTITYSPAWN)));
        setting.increase(entity);
        if (setting.isLimitReached(entity)) {
            this.removeEntity(entity);
        }
    }
    super.onEntityAdded(entity);
}