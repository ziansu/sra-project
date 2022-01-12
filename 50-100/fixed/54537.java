@java.lang.Override
public void registerIcons(net.minecraft.client.renderer.texture.IIconRegister register) {
    for (int i = 0; i < (subNames.length); i++) {
        this.iconArray[i] = register.registerIcon((("tragicmc:" + (subNames[i])) + "_lowRes"));
    }
}