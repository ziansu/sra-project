@java.lang.Override
public void setBreadCrumbSlot(org.ednovo.gooru.application.shared.model.folder.FolderDo folderObj, java.lang.String type, java.util.HashMap<java.lang.String, java.lang.String> selectedWidgetsTitleType) {
    this.folderObj = folderObj;
    if (folderObj != null) {
        org.ednovo.gooru.application.client.gin.AppClientFactory.getInjector().getHomeService().getLTIAssessmentUrl(folderObj.getUrl(), folderObj.getGooruOid(), new org.ednovo.gooru.application.client.SimpleAsyncCallback<java.lang.String>() {
            @java.lang.Override
            public void onSuccess(java.lang.String result) {
                LTI_URL = result;
            }
        });
    }
}