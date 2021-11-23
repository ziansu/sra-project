@java.lang.Override
public boolean onBlockActivated(net.minecraft.world.World w, int x, int y, int z, net.minecraft.entity.player.EntityPlayer pl, int s, float i, float j, float k) {
    net.minecraft.tileentity.TileEntity te = w.getTileEntity(x, y, z);
    if (te instanceof io.darkcraft.darkcore.mod.interfaces.IActivatable)
        ((io.darkcraft.darkcore.mod.interfaces.IActivatable) (te)).activate(pl, s);
    
    return true;
}