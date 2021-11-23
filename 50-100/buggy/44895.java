@java.lang.Override
public void click(net.minecraft.entity.player.EntityPlayer player, net.minecraft.util.MovingObjectPosition hit, net.minecraft.item.ItemStack item) {
    uk.co.qmunity.lib.raytrace.QMovingObjectPosition mop = rayTrace(uk.co.qmunity.lib.raytrace.RayTracer.instance().getStartVector(player), uk.co.qmunity.lib.raytrace.RayTracer.instance().getEndVector(player));
    if (mop != null)
        if ((mop.getPart()) instanceof uk.co.qmunity.lib.part.IPartInteractable)
            ((uk.co.qmunity.lib.part.IPartInteractable) (mop.getPart())).onClicked(player, mop, item);
        
    
}