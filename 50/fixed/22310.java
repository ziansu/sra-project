public void updateMailbox(no.runsafe.framework.api.player.IPlayer player, no.runsafe.framework.minecraft.inventory.RunsafeInventory inventory) {
    java.lang.String contents = inventory.serialize();
    this.database.execute("INSERT INTO player_mailboxes (player, contents) VALUES(?, ?) ON DUPLICATE KEY UPDATE contents = ?", player, contents, contents);
}