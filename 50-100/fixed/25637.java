@java.lang.Override
public void run() throws org.nuxeo.ecm.core.api.ClientException {
    try {
        org.nuxeo.dam.DamService damService = org.nuxeo.runtime.api.Framework.getLocalService(org.nuxeo.dam.DamService.class);
        folder = session.createDocumentModel(damService.getAssetLibraryPath(), org.nuxeo.common.utils.IdUtils.generateId(folderTitle), Constants.IMPORT_FOLDER_TYPE);
        folder.setPropertyValue(Constants.DUBLINCORE_TITLE_PROPERTY, folderTitle);
        folder = session.createDocument(folder);
        session.save();
    } catch (org.nuxeo.ecm.core.api.ClientException e) {
        org.nuxeo.dam.platform.context.ContainerFolderCreator.log.error(e, e);
    }
}