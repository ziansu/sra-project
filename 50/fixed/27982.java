public boolean isEntityFixed(net.minecraft.entity.Entity entity) {
    if ((getShipFixedOnto(entity, false)) != null) {
        return true;
    }
    return false;
}