@com.forgeessentials.core.preloader.asminjector.annotation.Inject(target = "tryCatchFire(Lnet/minecraft/world/World;IIIILjava/util/Random;ILnet/minecraftforge/common/util/ForgeDirection;)V", aliases = { "setBlock=func_147465_d" }, at = @com.forgeessentials.core.preloader.asminjector.annotation.At(value = "INVOKE", target = "Lnet/minecraft/world/World;setBlock(IIILnet/minecraft/block/Block;II)Z", shift = com.forgeessentials.core.preloader.asminjector.annotation.At.Shift.LAST_LABEL))
public void handleTryCatchFireA(net.minecraft.world.World world, int x, int y, int z, int chance, java.util.Random rnd, int argValue1, net.minecraftforge.common.util.ForgeDirection face, com.forgeessentials.core.preloader.asminjector.CallbackInfo ci) {
    if (MinecraftForge.EVENT_BUS.post(new net.minecraftforge.fe.event.world.FireEvent.Destroy(x, y, z, world, this, argValue1))) {
        ci.doReturn();
    }
}