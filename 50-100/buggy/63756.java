public void setData(org.ednovo.gooru.application.shared.model.folder.FolderDo folderObj, java.lang.String type) {
    if ((folderObj != null) && ((folderObj.getGooruOid()) != null)) {
        getCollectionDo(folderObj.getGooruOid());
    }else {
        java.lang.System.out.println(("type::" + type));
        getView().setCouseData(folderObj, type);
        if (!(getViewType().equalsIgnoreCase(org.ednovo.gooru.client.mvp.gshelf.collectiondetails.CollectionInfoPresenter.FOLDER))) {
            callCourseInfoTaxonomy();
        }
    }
}