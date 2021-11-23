@java.lang.Override
public float getStrength(net.minecraft.util.MovingObjectPosition hit, net.minecraft.entity.player.EntityPlayer player) {
    uk.co.qmunity.lib.raytrace.QMovingObjectPosition mop = rayTrace(uk.co.qmunity.lib.raytrace.RayTracer.getStartVector(player), uk.co.qmunity.lib.raytrace.RayTracer.getEndVector(player));
    if ((mop != null) && ((mop.getPart()) != null))
        return ((float) (30 * (mop.getPart().getHardness(player, mop))));
    
    return 30;
}