public void zumShopButton() {
    obenPanel.remove(warenKorbButtons.zumShop);
    contentframe.remove(warenkorbPanel);
    contentframe.remove(untenWarenKorbBereichPanel);
    untenWarenKorbBereichPanel.remove(warenKorbButtons.kaufAbschliessenButton);
    initialize();
    userpanel.setVisible(true);
    refresh();
}