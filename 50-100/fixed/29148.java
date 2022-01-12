public static void playSound(net.minecraft.world.World worldObj, net.minecraft.util.math.BlockPos pos, net.minecraft.util.SoundEvent soundIn, net.minecraft.util.SoundCategory category) {
    if (((pos != null) && (soundIn != null)) && (category != null))
        worldObj.playSound(pos.getX(), pos.getY(), pos.getZ(), soundIn, category, com.lothrazar.cyclicmagic.util.UtilSound.VOLUME, com.lothrazar.cyclicmagic.util.UtilSound.PITCH, com.lothrazar.cyclicmagic.util.UtilSound.distanceDelay);
    
}