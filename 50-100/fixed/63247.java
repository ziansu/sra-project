public void deleteRecord(final craftoplugin.modules.ban.BanRecord record) {
    org.apache.commons.lang.Validate.notNull(record, "The record cannot be null!");
    this.map.remove(record.getPlayer().getUniqueId());
    this.module.getPlugin().getScheduler().registerNewQuery(("DELETE FROM `cp_bans` WHERE `player_id` = " + (record.getPlayer().getId())));
}