@java.lang.Override
public void onSuccess(java.util.List<org.ednovo.gooru.shared.model.folder.FolderDo> folderListDo) {
    getView().clearTocData();
    getView().setFolderItems(folderListDo);
}