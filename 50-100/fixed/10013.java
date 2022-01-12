@java.lang.Override
public void dragTo(final illarion.client.world.interactive.InteractiveInventorySlot targetSlot) {
    if (!(isValidItem())) {
        return ;
    }
    final illarion.client.net.client.DragInvInvCmd cmd = illarion.client.net.CommandFactory.getInstance().getCommand(CommandList.CMD_DRAG_INV_INV, illarion.client.net.client.DragInvInvCmd.class);
    cmd.setDrag(getSlotId(), targetSlot.getSlotId());
    cmd.send();
}