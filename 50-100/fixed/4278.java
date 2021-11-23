public void addTarget(org.oreland.entity.Player p, org.oreland.entity.TargetLevel level, java.util.Date date) {
    if (level == null)
        return ;
    
    if (((p.target_level) == null) || (!(p.target_level.equal(level)))) {
        org.oreland.entity.Player.LevelHistoryEntry entry = new org.oreland.entity.Player.LevelHistoryEntry();
        entry.level = level;
        entry.date = date;
        p.target_level = level;
        p.level_history.add(entry);
    }
}