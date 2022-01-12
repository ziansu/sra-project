@java.lang.Override
public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
    if (isClicked) {
        isClicked = false;
        java.util.Map<java.lang.String, java.lang.String> params = new java.util.HashMap<java.lang.String, java.lang.String>();
        org.ednovo.gooru.application.client.gin.AppClientFactory.getPlaceManager().revealPlace(PlaceTokens.MYCONTENT, updateParameters(params, folderObj));
        getUiHandlers().getShelfMainPresenter().updateLeftShelfPanelActiveStyle();
    }
}