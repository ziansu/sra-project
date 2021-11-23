private void dropCurrentMaterial() {
    jsettlers.common.material.EMaterialType material = movable.getMaterial();
    if (material.isDroppable()) {
        super.getGrid().dropMaterial(movable.getPos(), material, true, false);
        super.setMaterial(EMaterialType.NO_MATERIAL);
    }
}