@java.lang.Override
public com.builtbroken.mc.lib.world.edit.BlockEdit changeBlock(com.builtbroken.mc.lib.transform.vector.Location location) {
    if ((location.getBlock()) == (net.minecraft.init.Blocks.air))
        return null;
    
    return new com.builtbroken.mc.lib.world.edit.BlockEdit(location).set(Blocks.air, 0, false, true);
}