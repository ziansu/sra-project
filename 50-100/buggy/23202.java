@java.lang.Override
public void scrollbarAction(int scrollbarId, fi.dy.masa.enderutilities.gui.client.base.ScrollBar.ScrollbarAction action, int position) {
    int row = ((((fi.dy.masa.enderutilities.tileentity.TileEntityJSU.INV_SIZE) / 9) - 6) * (this.scrollBar.getPosition())) / (this.scrollBar.getMaxPosition());
    this.containerJSU.performGuiAction(this.player, ContainerJSU.GUI_ACTION_SCROLL_SET, row);
    PacketHandler.INSTANCE.sendToServer(new fi.dy.masa.enderutilities.network.message.MessageGuiAction(0, net.minecraft.util.math.BlockPos.ORIGIN, fi.dy.masa.enderutilities.reference.ReferenceGuiIds.GUI_ID_CONTAINER_GENERIC, fi.dy.masa.enderutilities.inventory.container.ContainerJSU.GUI_ACTION_SCROLL_SET, row));
}