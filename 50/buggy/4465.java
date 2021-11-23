public void openQrCode() {
    clickOn(de.qabel.desktop.ui.accounting.identitycontextmenu.IdentityContextMenuPage.OPEN_QR);
    waitUntil(() -> controller.qrcodeController != null);
}