private void reload() {
    this.character.putAll(this.plugin.getConfigs().getReplaces());
    this.icons.putAll(this.plugin.getConfigsIcons().getAllIcons());
    this.format.putAll(this.plugin.getConfigs().getFormatGroups());
    this.plugin.getGame().getEventManager().post(new fr.evercraft.everapi.services.chat.event.ChatSystemEvent(this.plugin, ChatSystemEvent.Action.RELOADED));
}