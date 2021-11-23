void loadCommand(org.bukkit.entity.Player player, java.lang.String[] args) {
    if (!(verifyPermission(player, "donationboard.load")))
        return ;
    
    if (!(arrayLengthIsWithinInterval(args, 1, 1))) {
        player.sendMessage(se.fredsfursten.donationboardplugin.Commands.LOAD_COMMAND);
        return ;
    }
    se.fredsfursten.donationboardplugin.BoardController.get().load();
}