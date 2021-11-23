public void addMainText(java.lang.String text) {
    builder.getCurrent().setText(text);
    player.openInventory(getMainInventory());
    this.state = com.exoticcode.jsonchatcreator.api.GUISet.GUIState.MAIN;
    safe = false;
}