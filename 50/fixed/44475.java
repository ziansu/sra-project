@java.lang.Override
@net.minecraftforge.fml.relauncher.SideOnly(value = net.minecraftforge.fml.relauncher.Side.CLIENT)
public void registerIcons(keri.ninetaillib.texture.IIconRegistrar registrar) {
    this.texture = registrar.registerIcon((((modid) + ":items/tool/pickaxe_") + (this.getToolMaterialName().toLowerCase())));
}