public void setPlayer(@javax.annotation.Nonnull
net.minecraft.entity.player.EntityPlayer player) {
    this.player = player;
    playerName = player.getName();
    markDirty();
}