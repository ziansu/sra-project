public void updateStorageLocation(android.content.Context ctx, java.lang.String mount) {
    if ((mount == null) || (mount.equals(""))) {
        updateStorageLocation(ctx);
        return ;
    }
    java.lang.String currentLocation = this.getStorageLocation(ctx);
    if (currentLocation.startsWith(mount)) {
        return ;
    }
    java.lang.String location = mount + (org.digitalcampus.oppia.utils.storage.ExternalStorageStrategy.getInternalBasePath(ctx));
    updateLocationPreference(ctx, location);
}