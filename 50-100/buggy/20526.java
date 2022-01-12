@java.lang.Override
public void onSuccess(java.lang.String url) {
    if (isClassPageImage) {
        org.ednovo.gooru.application.client.gin.AppClientFactory.fireEvent(new org.ednovo.gooru.client.mvp.classpages.event.UpdateClasspageImageEvent(url));
    }else {
        if (isImageUploadedFromUrl) {
            org.ednovo.gooru.client.util.MixpanelUtil.AddImageByUrlOntheWeb();
        }else {
            org.ednovo.gooru.client.util.MixpanelUtil.AddImageFromMyComputer();
        }
        getShelfView().setCollectionImage(url);
    }
    getView().closeImageUploadWidget();
    getView().resetImageUploadWidget();
}