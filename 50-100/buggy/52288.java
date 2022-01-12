private void onNextPage(com.github.games647.lagmonitor.Pagination pagination, org.bukkit.command.CommandSender sender) {
    int lastPage = pagination.getLastSentPage();
    if (lastPage > (pagination.getTotalPages((sender instanceof org.bukkit.entity.Player)))) {
        sender.sendMessage(((org.bukkit.ChatColor.DARK_RED) + "You are already on the last page"));
        return ;
    }
    pagination.send(sender, (lastPage + 1));
}