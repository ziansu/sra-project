public static void registerBlocks(net.minecraftforge.fml.common.event.FMLPreInitializationEvent e) {
    net.minecraft.block.Block lift = new thut.tech.common.blocks.lift.BlockLift().setRegistryName(Reference.MOD_ID, "lift");
    net.minecraftforge.fml.common.registry.GameRegistry.registerTileEntity(thut.tech.common.blocks.lift.TileEntityLiftAccess.class, "liftaccesste");
    thut.lib.CompatWrapper.registerModEntity(thut.tech.common.entity.EntityLift.class, "lift", 1, TechCore.instance, 32, 1, true);
    thut.lib.CompatWrapper.registerModEntity(thut.tech.common.entity.EntityProjectile.class, "projectile", 2, TechCore.instance, 32, 1, true);
    thut.tech.common.handlers.BlockHandler.register(lift, thut.tech.common.handlers.BlockHandler.ItemLiftBlock.class, lift.getRegistryName().toString());
}