public java.util.Set<org.activityinfo.model.resource.ResourceId> getAdminLevelFormClassIds() {
    java.util.Set<org.activityinfo.model.resource.ResourceId> set = new java.util.HashSet<>();
    for (java.lang.Integer adminLevel : adminLevels) {
        set.add(org.activityinfo.model.legacy.CuidAdapter.adminLevelFormClass(adminLevel));
    }
    return set;
}