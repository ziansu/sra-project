public void unlink(cam72cam.immersiverailroading.entity.EntityLinkableRollingStock train) {
    if (train.getPersistentID().equals(this.getCoupledUUID(cam72cam.immersiverailroading.entity.EntityLinkableRollingStock.CouplerType.FRONT))) {
        unlink(cam72cam.immersiverailroading.entity.EntityLinkableRollingStock.CouplerType.FRONT);
    }else
        if (train.getPersistentID().equals(this.getCoupledUUID(cam72cam.immersiverailroading.entity.EntityLinkableRollingStock.CouplerType.BACK))) {
            unlink(cam72cam.immersiverailroading.entity.EntityLinkableRollingStock.CouplerType.BACK);
        }
    
}