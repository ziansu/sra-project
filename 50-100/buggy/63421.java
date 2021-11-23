private static boolean isRequired(com.appupdate.update.ManifestEntity manifestEntity, java.lang.String localVersion) {
    boolean isRequired = false;
    if (!(android.text.TextUtils.isEmpty(localVersion))) {
        java.util.List<java.lang.String> requiredVersions = manifestEntity.getRequired_versions();
        if (requiredVersions != null) {
            for (java.lang.String requiredVersion : requiredVersions) {
                if (localVersion.equals(requiredVersion)) {
                    isRequired = true;
                    break;
                }
            }
        }
    }
    return isRequired;
}