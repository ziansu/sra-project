@java.lang.Override
public void run() {
    int maxIndex = Lists.listToBroadcast.size();
    java.util.Random random = new java.util.Random();
    if (org.bukkit.Bukkit.getOnlinePlayers().isEmpty()) {
        cancel();
        return ;
    }
    for (org.bukkit.entity.Player player : org.bukkit.Bukkit.getOnlinePlayers()) {
        player.sendMessage(new org.chatmanager.util.Word(Lists.listToBroadcast.get(random.nextInt(maxIndex))).colorize());
    }
}