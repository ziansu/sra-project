@se.ranzdo.bukkit.methodcommand.Command(identifier = "strife xpmult", permissions = "strife.command.strife.xpmult", onlyPlayers = false)
public void setExpMultCommand(org.bukkit.command.CommandSender sender, @se.ranzdo.bukkit.methodcommand.Arg(name = "amount")
double amount) {
    com.tealcube.minecraft.bukkit.facecore.utilities.MessageUtils.sendMessage(sender, (((("&aBonus XP mult changed to " + amount) + "x from ") + ((plugin.getMultiplierManager().getExpMult()) + 1)) + "x!"));
    plugin.getMultiplierManager().setExpMult(amount);
}