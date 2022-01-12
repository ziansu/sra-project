void displaySettingsPage() {
    this.getUserService().getV2UserProfileDetails(org.ednovo.gooru.client.gin.AppClientFactory.getPlaceManager().getRequestParameter(org.ednovo.gooru.client.mvp.settings.UserSettingsPresenter.GOORU_UID), getUserV2ProfilePageAsyncCallback());
    org.ednovo.gooru.client.gin.AppClientFactory.fireEvent(new org.ednovo.gooru.client.mvp.home.event.HomeEvent(org.ednovo.gooru.client.mvp.home.event.HeaderTabType.NONE));
    org.ednovo.gooru.client.gin.AppClientFactory.fireEvent(new org.ednovo.gooru.client.mvp.search.event.SetFooterEvent(org.ednovo.gooru.client.gin.AppClientFactory.getPlaceManager().getCurrentPlaceRequest().getNameToken()));
    getView().setUserProfileImageUrl("EMPTY");
}