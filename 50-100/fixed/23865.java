public boolean removefromPlayerList(java.lang.String name) {
    if ((org.bukkit.Bukkit.getPlayer(name)) == null) {
        java.lang.System.out.print("玩家都不存在，肯定不在列表内");
        return false;
    }
    if (!(isInList(name))) {
        org.bukkit.Bukkit.getLogger().info("找不到玩家,移除什么");
        return false;
    }else {
        return this.removefromPlayerList(org.bukkit.Bukkit.getPlayer(name));
    }
}