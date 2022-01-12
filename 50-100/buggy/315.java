@java.lang.Override
public net.minecraft.util.AxisAlignedBB getCollisionBox(net.minecraft.entity.Entity entity) {
    if (ignoreEntity.contains(entity))
        return null;
    
    if (((!(entity instanceof net.minecraft.entity.item.EntityItem)) && (entity != (this.riddenByEntity))) && ((this.protectionTime) <= 0)) {
        if (entity instanceof defense.common.entity.EntityMissile) {
            ((defense.common.entity.EntityMissile) (entity)).setNormalExplode();
        }
        this.setExplode();
    }
    return null;
}