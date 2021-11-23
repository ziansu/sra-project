public static int getBestAvailableMapping(int apiVersion) {
    int version = -1;
    for (int i = apiVersion - 1; (i >= 0) && (i < (com.ensoftcorp.open.android.essentials.permissions.mappings.PermissionMapping.PERMISSION_MAPPING_RESOURCES.size())); i++) {
        if ((com.ensoftcorp.open.android.essentials.permissions.mappings.PermissionMapping.PERMISSION_MAPPING_RESOURCES.get(i)) != null) {
            version = i + 1;
            break;
        }
    }
    if (version == (-1)) {
        version = com.ensoftcorp.open.android.essentials.permissions.mappings.PermissionMapping.HIGHEST_AVAILABLE_MAPPING;
    }
    return version;
}