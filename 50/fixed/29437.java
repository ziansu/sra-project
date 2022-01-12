public java.util.List<org.activityinfo.model.resource.ResourceId> getAdminLevelFormClassIds() {
    java.util.List<org.activityinfo.model.resource.ResourceId> set = new java.util.ArrayList<>();
    for (java.lang.Integer adminLevel : adminLevels) {
        set.add(org.activityinfo.model.legacy.CuidAdapter.adminLevelFormClass(adminLevel));
    }
    return set;
}