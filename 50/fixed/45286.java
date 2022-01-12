@java.lang.Override
public void onSuccess(org.ednovo.gooru.application.shared.model.content.CollectionDo result) {
    getView().setData(result, folderDo, RefreshType.INSERT);
}