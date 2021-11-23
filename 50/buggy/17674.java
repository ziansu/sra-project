void openIdentityEdit() {
    clickOn(de.qabel.desktop.ui.accounting.identitycontextmenu.IdentityContextMenuPage.OPEN_ID_EDIT);
    waitUntil(() -> controller.identityEditController != null);
}