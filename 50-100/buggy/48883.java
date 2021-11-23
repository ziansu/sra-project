public static boolean hasFolder(long groupId, long parentFolderId, java.lang.String name) {
    boolean result = false;
    com.liferay.portlet.documentlibrary.model.DLFolder dlFolder = null;
    try {
        dlFolder = com.liferay.portlet.documentlibrary.service.DLFolderLocalServiceUtil.getFolder(groupId, parentFolderId, name);
    } catch (java.lang.Exception e) {
        org.opencps.util.DLFolderUtil._log.warn(e.getMessage());
    }
    result = (dlFolder != null) ? true : false;
    return result;
}