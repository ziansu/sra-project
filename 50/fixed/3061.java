public static boolean isEntityMetallic(net.minecraft.entity.Entity ent) {
    if (cn.academy.vanilla.electromaster.CatElectromaster.metalEntities.isEmpty())
        return false;
    
    for (java.lang.Class<? extends net.minecraft.entity.Entity> cl : cn.academy.vanilla.electromaster.CatElectromaster.metalEntities) {
        if (cl.isInstance(ent))
            return true;
        
    }
    return false;
}