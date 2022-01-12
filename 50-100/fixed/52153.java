@org.spongepowered.asm.mixin.injection.Inject(method = "updateTagCompound", at = @org.spongepowered.asm.mixin.injection.At(value = "HEAD"))
private void ensureLevelNameMatchesDirectory(net.minecraft.nbt.NBTTagCompound compound, net.minecraft.nbt.NBTTagCompound player, org.spongepowered.asm.mixin.injection.callback.CallbackInfo ci) {
    if ((this.dimensionId) == null) {
        return ;
    }
    final java.lang.String name = org.spongepowered.common.world.WorldManager.getWorldFolderByDimensionId(this.dimensionId).orElse(this.levelName);
    if (!(this.levelName.equalsIgnoreCase(name))) {
        this.levelName = name;
    }
}