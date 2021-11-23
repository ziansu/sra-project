public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
    if (actorConfigTab.currentEditSite.getName().equals(actorConfigTab.newSiteName)) {
        new gov.nist.toolkit.xdstools2.client.PopupMessage("You must give site a real name before saving");
        return ;
    }
    if (gov.nist.toolkit.xdstools2.client.PasswordManagement.isSignedIn) {
        actorConfigTab.saveSignedInCallback.onSuccess(true);
    }else {
        gov.nist.toolkit.xdstools2.client.PasswordManagement.addSignInCallback(actorConfigTab.saveSignedInCallback);
        new gov.nist.toolkit.xdstools2.client.AdminPasswordDialogBox(actorConfigTab.getTabTopPanel());
    }
}