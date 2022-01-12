@java.lang.Override
public final void lineExecuted(final fr.skyost.algo.core.AlgoRunnable runnable, final fr.skyost.algo.core.AlgoLine line, final boolean before) {
    if ((AlgogoBukkit.config.algorithmsDebug) && before) {
        sender.sendMessage((((((org.bukkit.ChatColor.GRAY) + "Executing line \"") + (fr.skyost.algo.bukkit.listeners.AlgorithmListener.getLine(ChatColor.WHITE, line.getInstruction(), line.getArgs()))) + (org.bukkit.ChatColor.GRAY)) + "\"..."));
    }
}