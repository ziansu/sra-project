public void onBreak(net.minecraftforge.event.world.BlockEvent.BreakEvent event) {
    if ((wrapper) != null) {
        if (event != null) {
            wrapper.leave(this.pos, worldObj, event.getPlayer());
        }else {
            wrapper.leave(this.pos, worldObj, null);
        }
    }
}