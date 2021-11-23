public void addMainText(java.lang.String text) {
    builder.getCurrent().setText(text);
    safe = false;
    player.openInventory(getMainInventory());
    this.state = com.exoticcode.jsonchatcreator.api.GUISet.GUIState.MAIN;
}