@org.spongepowered.api.event.Listener
public void onPostInitialization(org.spongepowered.api.event.game.state.GamePostInitializationEvent event) {
    this.translation = new com.github.ustc_zzzz.virtualchest.translation.VirtualChestTranslation(this);
    this.virtualChestActions = new com.github.ustc_zzzz.virtualchest.action.VirtualChestActions(this);
    this.virtualChestCommand = new com.github.ustc_zzzz.virtualchest.command.VirtualChestCommand(this);
    this.commandAliases = new com.github.ustc_zzzz.virtualchest.command.VirtualChestCommandAliases(this);
    this.dispatcher = new com.github.ustc_zzzz.virtualchest.inventory.VirtualChestInventoryDispatcher(this);
    this.permissionManager = new com.github.ustc_zzzz.virtualchest.permission.VirtualChestPermissionManager(this);
    this.placeholderManager = new com.github.ustc_zzzz.virtualchest.placeholder.VirtualChestPlaceholderManager(this);
}