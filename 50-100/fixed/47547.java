@java.lang.Override
public net.minecraftforge.fml.common.network.simpleimpl.IMessage onMessage(com.lothrazar.powerinventory.proxy.WithdrawButtonPacket message, net.minecraftforge.fml.common.network.simpleimpl.MessageContext ctx) {
    net.minecraft.entity.player.EntityPlayer p = ctx.getServerHandler().playerEntity;
    if ((p.openContainer) != null) {
        com.lothrazar.powerinventory.UtilInventory.moveallContainerToPlayer(p, p.openContainer);
        p.inventoryContainer.detectAndSendChanges();
        p.openContainer.detectAndSendChanges();
    }
    return null;
}