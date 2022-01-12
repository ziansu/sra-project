@se.ranzdo.bukkit.methodcommand.Command(identifier = "strife dropmult", permissions = "strife.command.strife.dropmult", onlyPlayers = false)
public void setDropMultCommand(org.bukkit.command.CommandSender sender, @se.ranzdo.bukkit.methodcommand.Arg(name = "amount")
double amount) {
    com.tealcube.minecraft.bukkit.facecore.utilities.MessageUtils.sendMessage(sender, (((("&aBonus drop mult changed to " + amount) + "x from ") + ((plugin.getMultiplierManager().getDropMult()) + 1)) + "x!"));
    plugin.getMultiplierManager().setDropMult(amount);
}