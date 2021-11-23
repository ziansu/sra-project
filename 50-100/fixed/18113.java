public void setResourceWidgetContainerHeight() {
    int windowHeight = com.google.gwt.user.client.Window.getClientHeight();
    if (org.ednovo.gooru.client.gin.AppClientFactory.getCurrentPlaceToken().equalsIgnoreCase(PlaceTokens.RESOURCE_PLAY)) {
        resourceWidgetContainer.setHeight(((windowHeight - 116) + "px"));
    }else {
        resourceWidgetContainer.setHeight(((windowHeight - 202) + "px"));
    }
}