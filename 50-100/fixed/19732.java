@cpw.mods.fml.relauncher.SideOnly(value = cpw.mods.fml.relauncher.Side.CLIENT)
public net.minecraft.entity.item.EntityMinecart getCartInClient(int cartID) {
    if (cartID <= 0)
        return null;
    
    net.minecraft.entity.item.EntityMinecart cart;
    try {
        cart = ((net.minecraft.entity.item.EntityMinecart) (net.minecraft.client.Minecraft.getMinecraft().theWorld.getEntityByID(cartID)));
    } catch (java.lang.Exception e) {
        return null;
    }
    return cart;
}