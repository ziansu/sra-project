private static void RegisterMachines() {
    genericminecraftmod.GenericMinecraftMod.blockGenericModFurnace = new genericminecraftmod.block.GenericFurnaceBlock();
    cpw.mods.fml.common.registry.GameRegistry.registerBlock(genericminecraftmod.GenericMinecraftMod.blockGenericModFurnace, genericminecraftmod.GenericMinecraftMod.blockGenericModFurnace.getUnlocalizedName());
    java.lang.System.out.println(genericminecraftmod.GenericMinecraftMod.blockGenericModFurnace.getItemIconName());
}