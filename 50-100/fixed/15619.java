public static cam72cam.immersiverailroading.entity.EntityLinkableRollingStock findByUUID(net.minecraft.world.World world, java.util.UUID uuid) {
    for (java.lang.Object e : world.getLoadedEntityList()) {
        if (e instanceof cam72cam.immersiverailroading.entity.EntityLinkableRollingStock) {
            cam72cam.immersiverailroading.entity.EntityLinkableRollingStock train = ((cam72cam.immersiverailroading.entity.EntityLinkableRollingStock) (e));
            if (train.getPersistentID().equals(uuid)) {
                return train;
            }
        }
    }
    return null;
}