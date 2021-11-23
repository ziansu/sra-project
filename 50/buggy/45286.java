@java.lang.Override
public void onSuccess(org.ednovo.gooru.application.shared.model.content.CollectionDo result) {
    java.lang.System.out.println(("result.getCollectionItems().size():::" + (result.getCollectionItems().size())));
    getView().setData(result, folderDo, RefreshType.INSERT);
}