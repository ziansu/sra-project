protected void updateSgIoUnfilteredChangeability() {
    if (!(getIsScsiPassthrough().getEntity())) {
        getIsSgIoUnfiltered().setChangeProhibitionReason(org.ovirt.engine.ui.uicommonweb.models.vms.AbstractDiskModel.constants.cannotEnableSgioWhenScsiPassthroughDisabled());
        getIsSgIoUnfiltered().setIsChangeable(false);
        getIsSgIoUnfiltered().setEntity(false);
        return ;
    }
    if (isEditEnabled()) {
        getIsSgIoUnfiltered().setChangeProhibitionReason(null);
    }
    getIsSgIoUnfiltered().setIsChangeable(isEditEnabled());
}