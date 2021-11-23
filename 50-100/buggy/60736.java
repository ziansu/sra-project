@java.lang.Override
public java.lang.Object getClientGuiElement(int ID, net.minecraft.entity.player.EntityPlayer player, net.minecraft.world.World world, int x, int y, int z) {
    if (world instanceof net.minecraft.client.multiplayer.WorldClient) {
        switch (ID) {
            case baubles.common.Baubles.GUI :
                return new baubles.client.gui.GuiPlayerExpanded(player, x, y);
        }
    }
    return null;
}