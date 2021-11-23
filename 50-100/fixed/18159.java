@java.lang.Override
protected boolean isInstantiationApplicable(mil.jpeojtrs.sca.dcd.DcdComponentInstantiation instantiation) {
    mil.jpeojtrs.sca.spd.SoftPkg spd = instantiation.getPlacement().getComponentFileRef().getFile().getSoftPkg();
    if (spd == null) {
        return true;
    }
    if (spd.getDescriptor().getComponent().getComponentType().equals(mil.jpeojtrs.sca.scd.ComponentType.SERVICE.getLiteral())) {
        return true;
    }
    return false;
}