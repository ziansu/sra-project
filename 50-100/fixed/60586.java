@java.lang.SuppressWarnings(value = "unchecked")
public static <T> T getPart(net.minecraft.world.World world, uk.co.qmunity.lib.vec.Vec3i location, java.lang.Class<T> type) {
    uk.co.qmunity.lib.part.ITilePartHolder h = uk.co.qmunity.lib.part.compat.MultipartCompatibility.getPartHolder(world, location);
    if (h == null)
        return null;
    
    for (uk.co.qmunity.lib.part.IPart p : h.getParts())
        if (type.isAssignableFrom(p.getClass()))
            return ((T) (p));
        
    
    return null;
}