public static void stopTimer() {
    if (((theweekend.visual.TopBar.task) == null) || ((theweekend.visual.TopBar.lastBar) == null)) {
        return ;
    }
    if ((org.bukkit.Bukkit.getOnlinePlayers().size()) == 1) {
        org.bukkit.Bukkit.getScheduler().cancelTask(theweekend.visual.TopBar.task);
        theweekend.visual.TopBar.task = null;
        theweekend.visual.TopBar.lastBar = null;
    }
}