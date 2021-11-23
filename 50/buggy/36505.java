public static org.nebulamc.ncommand.impl.bukkit.BukkitNebulaCommand fromNebulaCommand(org.nebulamc.ncommand.command.NebulaCommand cmd) {
    return new org.nebulamc.ncommand.impl.bukkit.BukkitNebulaCommand(cmd.getName(), cmd.getDesc(), cmd.getUsage(), java.util.Arrays.asList(cmd.getAliases()), cmd.getM());
}