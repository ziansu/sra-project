public boolean canModifyTemplates() {
    if (isEditResource()) {
        return templateEditor.hasPermissionToModifyResourceTemplate(resourceId, settings.isTestingMode());
    }else {
        return templateEditor.hasPermissionToModifyResourceTypeTemplate(resourceTypeId, settings.isTestingMode());
    }
}