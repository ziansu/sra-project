public void onBreak(net.minecraftforge.event.world.BlockEvent.BreakEvent event) {
    if ((wrapper) != null) {
        if (event != null) {
            wrapper.leave(new net.minecraft.util.BlockPos(this.pos), worldObj, event.getPlayer());
        }else {
            wrapper.leave(new net.minecraft.util.BlockPos(this.pos), worldObj, null);
        }
    }
}