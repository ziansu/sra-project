@java.lang.Override
public java.lang.String getUnlocalizedName(net.minecraft.item.ItemStack stack) {
    io.github.mc_umod.enumtype.EnumTypeBaseStuff type = io.github.mc_umod.enumtype.EnumTypeBaseStuff.byMetadata(stack.getMetadata());
    java.lang.System.out.println(type.name());
    if ((block) instanceof io.github.mc_umod.item.block.BlockOres) {
        return "tile.ore" + (type.getName());
    }else
        if ((block) instanceof io.github.mc_umod.item.block.BlockNetherOres) {
            return "tile.netherore" + (type.getName());
        }else {
            return "";
        }
    
}