public static void stopTimer() {
    if (((theweekend.visual.TopBar.task) == null) || ((theweekend.visual.TopBar.lastBar) == null)) {
        return ;
    }
    if ((org.bukkit.Bukkit.getOnlinePlayers().size()) == 1) {
        theweekend.visual.TopBar.lastBar.setVisible(false);
        org.bukkit.Bukkit.getScheduler().cancelTask(theweekend.visual.TopBar.task);
        theweekend.visual.TopBar.task = null;
    }
}