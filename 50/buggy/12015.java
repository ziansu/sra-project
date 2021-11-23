public void rebuild(final int uiSize) {
    cGameSkin.createUIElements(uiSize);
    for (cg.group4.view.screen_mechanics.ScreenLogic screen : cScreens.values()) {
        screen.rebuildWidgetGroup();
    }
}