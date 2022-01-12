public void CharInvSearch(java.lang.String type) {
    ArkBotGUI.GUIText("[ACTION]: Searching character inventory");
    p = java.awt.MouseInfo.getPointerInfo().getLocation();
    drag.move(ArkBot.global.CHAR_INV_SEARCH_BAR);
    leftClick();
    bot.delay(Global.PAUSE);
    leftClick();
    bot.delay(Global.PAUSE);
    leftClick();
    robtype.type(type);
}