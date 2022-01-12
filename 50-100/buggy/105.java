@java.lang.Override
public boolean activate(net.minecraft.entity.player.EntityPlayer player, net.minecraft.util.MovingObjectPosition hit, net.minecraft.item.ItemStack item) {
    uk.co.qmunity.lib.raytrace.QMovingObjectPosition mop = rayTrace(uk.co.qmunity.lib.raytrace.RayTracer.instance().getStartVector(player), uk.co.qmunity.lib.raytrace.RayTracer.instance().getEndVector(player));
    if (mop != null)
        if ((mop.getPart()) instanceof uk.co.qmunity.lib.part.IPartInteractable)
            return ((uk.co.qmunity.lib.part.IPartInteractable) (mop.getPart())).onActivated(player, mop, item);
        
    
    return false;
}