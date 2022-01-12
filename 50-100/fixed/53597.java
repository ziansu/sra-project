@java.lang.Override
public void onClickSubmit(com.google.gwt.event.dom.client.ClickEvent event) {
    super.hide();
    if (!(getUiHandlers().isOeAnswerSubmited())) {
        org.ednovo.gooru.client.mvp.assessments.play.collection.preview.metadata.NavigationConfirmPopup confirmPopup = new org.ednovo.gooru.client.mvp.assessments.play.collection.preview.metadata.NavigationConfirmPopup() {
            @java.lang.Override
            public void navigateToNextResource() {
                super.hide();
                org.ednovo.gooru.application.client.gin.AppClientFactory.getPlaceManager().revealPlace(false, resourceRequest, true);
            }
        };
    }else {
        org.ednovo.gooru.application.client.gin.AppClientFactory.getPlaceManager().revealPlace(false, resourceRequest, true);
    }
}