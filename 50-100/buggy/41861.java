private void createTable() {
    craftoplugin.core.CraftoMessenger.debug("Creating table...");
    final java.lang.String[] cp_bans = new java.lang.String[7];
    cp_bans[0] = "id INT AUTO_INCREMENT PRIMARY KEY";
    cp_bans[1] = "player_id INT(11) UNIQUE KEY NOT NULL";
    cp_bans[2] = "banned_by INT(11) NOT NULL";
    cp_bans[3] = "reason VARCHAR(255)";
    cp_bans[4] = "created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL";
    cp_bans[5] = "duration long NOT NULL";
    cp_bans[6] = "INDEX `banned_by` (`banned_by`)";
    this.connection.getSQL().createTable("cp_bans", cp_bans, true);
    craftoplugin.core.CraftoMessenger.debug("Created table!");
}