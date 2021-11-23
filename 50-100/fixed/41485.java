public static void playSound(net.minecraft.entity.player.EntityPlayer player, net.minecraft.util.math.BlockPos pos, net.minecraft.util.SoundEvent soundIn, net.minecraft.util.SoundCategory cat, float volume) {
    if (player == null) {
        return ;
    }
    player.getEntityWorld().playSound(player, pos, soundIn, cat, volume, com.lothrazar.cyclicmagic.util.UtilSound.PITCH);
}