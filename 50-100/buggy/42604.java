@java.lang.Override
public void registerBlockIcons(net.minecraft.client.renderer.texture.IIconRegister iconRegister) {
    for (int i = 0; i < (icons.length); i++) {
        if ((i < 1) || (i > 1))
            icons[i] = iconRegister.registerIcon("thaumcraft:metalbase");
        else
            icons[i] = iconRegister.registerIcon(("witchinggadgets:" + (witchinggadgets.common.blocks.BlockWGMetalDevice.subNames[i])));
        
    }
}