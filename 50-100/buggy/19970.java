public static int getBestAvailableMapping(int apiVersion) {
    int version = -1;
    if (apiVersion > 0) {
        for (int i = apiVersion; i < (com.ensoftcorp.open.android.essentials.permissions.mappings.PermissionMapping.PERMISSION_MAPPING_RESOURCES.size()); i++) {
            if ((com.ensoftcorp.open.android.essentials.permissions.mappings.PermissionMapping.PERMISSION_MAPPING_RESOURCES.get(i)) != null) {
                version = i;
                break;
            }
        }
    }
    if (version == (-1)) {
        version = com.ensoftcorp.open.android.essentials.permissions.mappings.PermissionMapping.HIGHEST_AVAILABLE_MAPPING;
    }
    return version;
}