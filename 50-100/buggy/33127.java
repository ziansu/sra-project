public no.runsafe.framework.minecraft.inventory.RunsafeInventory getMailbox(no.runsafe.framework.api.player.IPlayer player) {
    no.runsafe.framework.minecraft.inventory.RunsafeInventory inventory = server.createInventory(null, 27, java.lang.String.format("%s's Mailbox", player.getName()));
    java.lang.String data = this.database.queryString("SELECT contents FROM player_mailboxes WHERE player = ?", player.getUniqueId().toString());
    if (data != null)
        inventory.unserialize(data);
    
    return inventory;
}