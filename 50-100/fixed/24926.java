public void onSuccess(com.silverpeas.mobile.shared.dto.DetailUserDTO user) {
    com.silverpeas.mobile.client.SpMobil.user = user;
    com.silverpeas.mobile.client.SpMobil.mainPage.setUser(user);
    com.google.gwt.user.client.ui.RootPanel.get().clear();
    com.google.gwt.user.client.ui.RootPanel.get().add(com.silverpeas.mobile.client.SpMobil.mainPage);
    com.silverpeas.mobile.client.common.navigation.PageHistory.getInstance().goTo(new com.silverpeas.mobile.client.pages.main.AppList());
    if ((((com.silverpeas.mobile.client.SpMobil.shortcutAppId) != null) && ((com.silverpeas.mobile.client.SpMobil.shortcutContentType) != null)) && ((com.silverpeas.mobile.client.SpMobil.shortcutContentId) != null)) {
        com.silverpeas.mobile.client.common.ShortCutRouter.route(user, com.silverpeas.mobile.client.SpMobil.shortcutAppId, com.silverpeas.mobile.client.SpMobil.shortcutContentType, com.silverpeas.mobile.client.SpMobil.shortcutContentId);
    }
}