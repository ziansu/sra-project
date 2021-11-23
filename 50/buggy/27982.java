public boolean isEntityFixed(net.minecraft.entity.Entity entity) {
    if ((getShipFixedOnto(entity)) != null) {
        return true;
    }
    return false;
}