public io.darkcraft.darkcore.mod.abstracts.AbstractItem register() {
    if ((io.darkcraft.darkcore.mod.DarkcoreMod.proxy) instanceof io.darkcraft.darkcore.mod.proxy.ClientProxy)
        if ((getRenderer()) != null)
            registerIcons = false;
        
    
    cpw.mods.fml.common.registry.GameRegistry.registerItem(this, getUnlocalizedName());
    if ((io.darkcraft.darkcore.mod.DarkcoreMod.proxy) instanceof io.darkcraft.darkcore.mod.proxy.ClientProxy)
        ((io.darkcraft.darkcore.mod.proxy.ClientProxy) (DarkcoreMod.proxy)).registerClientItem(this);
    
    return this;
}