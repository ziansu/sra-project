public boolean updateStorageLocation(android.content.Context ctx, java.lang.String mount) {
    if ((mount == null) || (mount.equals(""))) {
        return updateStorageLocation(ctx);
    }
    java.lang.String currentLocation = this.getStorageLocation(ctx);
    if (currentLocation.startsWith(mount)) {
        return true;
    }
    java.lang.String location = mount + (org.digitalcampus.oppia.utils.storage.ExternalStorageStrategy.getInternalBasePath(ctx));
    updateLocationPreference(ctx, location);
    return true;
}