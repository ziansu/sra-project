@java.lang.Override
protected boolean isGhost(org.ovirt.engine.ui.uicommonweb.models.macpool.MacRangeModel value) {
    return (org.ovirt.engine.core.compat.StringHelper.isNullOrEmpty(value.getLeftBound().getEntity())) && (org.ovirt.engine.core.compat.StringHelper.isNullOrEmpty(value.getRightBound().getEntity()));
}