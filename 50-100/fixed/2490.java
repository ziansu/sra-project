public static com.liferay.portlet.documentlibrary.model.DLFolder getFolder(long groupId, long parentFolderId, java.lang.String name) {
    com.liferay.portlet.documentlibrary.model.DLFolder dlFolder = null;
    try {
        dlFolder = com.liferay.portlet.documentlibrary.service.DLFolderLocalServiceUtil.getFolder(groupId, parentFolderId, name);
    } catch (java.lang.Exception e) {
        org.opencps.util.DLFolderUtil._log.error(e);
    }
    return dlFolder;
}