public void execute() {
    ObjectService.Util.getInstance().hideGroupSharedFolder(virtualFolder.getId(), session.getPrimaryGroup().getId(), new edu.umn.msi.tropix.webgui.client.AsyncCallbackImpl<java.lang.Void>() {
        @java.lang.Override
        public void onSuccess(final java.lang.Void ignored) {
            edu.umn.msi.tropix.webgui.client.mediators.LocationUpdateMediator.getInstance().onEvent(new edu.umn.msi.tropix.webgui.client.mediators.LocationUpdateMediator.UpdateEvent(edu.umn.msi.tropix.models.locations.Locations.MY_GROUP_SHARED_FOLDERS_ID, null));
        }
    });
}