@java.lang.Override
public net.minecraft.item.ItemStack pickItem(net.minecraft.util.MovingObjectPosition hit) {
    uk.co.qmunity.lib.raytrace.QMovingObjectPosition mop = rayTrace(uk.co.qmunity.lib.raytrace.RayTracer.getStartVector(QmunityLib.proxy.getPlayer()), uk.co.qmunity.lib.raytrace.RayTracer.getEndVector(QmunityLib.proxy.getPlayer()));
    if (mop == null)
        return null;
    
    return mop.getPart().getItem();
}