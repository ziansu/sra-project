public static void playSound(net.minecraft.entity.player.EntityPlayer player, net.minecraft.util.math.BlockPos pos, net.minecraft.util.SoundEvent soundIn, net.minecraft.util.SoundCategory cat) {
    if (player == null) {
        ModCyclic.logger.warn("Null player object attempting to play sound [2]");
        return ;
    }
    net.minecraft.util.math.BlockPos here = (pos == null) ? player.getPosition() : pos;
    player.getEntityWorld().playSound(player, here, soundIn, cat, com.lothrazar.cyclicmagic.util.UtilSound.VOLUME, com.lothrazar.cyclicmagic.util.UtilSound.PITCH);
}