public void earnReward() {
    mainGUI.goToCard(ChemistryPassportGUI.PASSPORT_TEXT);
    passport.goToPage(getButtonName());
    passport.KitPage kitPage = passport.getKitPage(getButtonName());
    kitPage.startStickerAnimation();
    kitPage.enableRewardButton();
    repaint();
}