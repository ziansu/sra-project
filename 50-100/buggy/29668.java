private static boolean dailyCombo(org.bukkit.entity.Player player) {
    java.lang.String lastClaim = theweekend.stats.PlayerData.getLastDailyClaim(player);
    java.util.Calendar oldCalendar = resources.TTime.convertCalendar("M/d/yyyy H:mm:ss", lastClaim);
    oldCalendar.add(java.util.Calendar.HOUR_OF_DAY, 22);
    java.util.Calendar currentTime = java.util.Calendar.getInstance();
    if ((currentTime.get(java.util.Calendar.DAY_OF_YEAR)) == (oldCalendar.get(java.util.Calendar.DAY_OF_YEAR))) {
        return true;
    }
    return false;
}