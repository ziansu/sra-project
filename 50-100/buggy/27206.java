@com.forgeessentials.core.preloader.asminjector.annotation.Inject(target = "updateTick(Lnet/minecraft/world/World;IIILjava/util/Random;)V", aliases = { "updateTick=func_149674_a" , "setBlock=func_147465_d" }, at = @com.forgeessentials.core.preloader.asminjector.annotation.At(value = "INVOKE", target = "Lnet/minecraft/world/World;setBlock(IIILnet/minecraft/block/Block;II)Z", shift = com.forgeessentials.core.preloader.asminjector.annotation.At.Shift.LAST_LABEL))
public void updateTick(net.minecraft.world.World world, int sourceX, int sourceY, int sourceZ, java.util.Random rnd, com.forgeessentials.core.preloader.asminjector.CallbackInfo ci, @com.forgeessentials.core.preloader.asminjector.annotation.Local(value = "p_149674_2_")
int x, @com.forgeessentials.core.preloader.asminjector.annotation.Local(value = "p_149674_4_")
int y, @com.forgeessentials.core.preloader.asminjector.annotation.Local(value = "p_149674_3_")
int z) {
    java.lang.System.out.println(java.lang.String.format("Injector: Fire spreading to other block from [%d,%d,%d] to [%d,%d,%d]", sourceX, sourceY, sourceZ, x, y, z));
    if (MinecraftForge.EVENT_BUS.post(new net.minecraftforge.fe.event.world.FireEvent.Spread(x, y, z, world, this, 3, sourceX, sourceY, sourceZ))) {
        ci.doReturn();
    }
}