public void setFaction(java.lang.String factionId) {
    this.values.put("faction", factionId);
    net.redstoneore.legacyfactions.entity.persist.mysql.FactionsMySQL.get().prepare("UPDATE `fplayer` SET `faction` = ? WHERE `id` = ?").setCatched(1, factionId).setCatched(2, this.id).execute(ExecuteType.UPDATE);
}