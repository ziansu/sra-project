com.constellio.app.ui.framework.components.ComponentState getEditButtonState(com.constellio.model.entities.records.wrappers.User user, com.constellio.app.modules.rm.wrappers.Folder folder) {
    if ((org.apache.commons.lang.StringUtils.isBlank(folder.getLegacyId())) || ((org.apache.commons.lang.StringUtils.isNotBlank(folder.getLegacyId())) && (user.has(RMPermissionsTo.MODIFY_IMPORTED_FOLDERS).on(folder)))) {
        return com.constellio.app.ui.framework.components.ComponentState.INVISIBLE;
    }
    return com.constellio.app.ui.framework.components.ComponentState.visibleIf(((user.hasWriteAccess().on(folder)) && (extensions.isRecordModifiableBy(folder.getWrappedRecord(), user))));
}