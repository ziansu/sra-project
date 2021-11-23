public void solidRenderingEnableAOCBx_changed() {
    if (!(isNoRefresh())) {
        org.jwildfire.create.tina.base.Flame flame = getCurrFlame();
        if (flame != null) {
            owner.saveUndoPoint();
            flame.getSolidRenderSettings().setAoEnabled(data.tinaSolidRenderingEnableAOCBx.isSelected());
            enableControls();
            owner.refreshFlameImage(true, false, 1, true, true);
        }
    }
}