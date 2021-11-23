@java.lang.Override
public void onSuccess(com.hdm.Application.shared.bo.AppUser result) {
    com.hdm.Application.client.ClientsideSettings.getLogger().severe(("Success EditNoteCallback: " + (result.getClass().getSimpleName())));
    currentUser = result;
    Application.userLabel.setText(("Sie sind eingeloggt als: " + (currentUser.getUserName())));
    com.hdm.Application.client.gui.Update update = new com.hdm.Application.client.gui.WelcomeView();
    com.google.gwt.user.client.ui.RootPanel.get("Details").clear();
    com.google.gwt.user.client.ui.RootPanel.get("Details").add(update);
}