@java.lang.Override
public void execute(@org.jetbrains.annotations.NotNull
final net.minecraft.server.MinecraftServer server, @org.jetbrains.annotations.NotNull
final net.minecraft.command.ICommandSender sender, @org.jetbrains.annotations.NotNull
final java.lang.String... args) throws net.minecraft.command.CommandException {
    if (isPlayerOpped(sender)) {
        server.addScheduledTask(() -> {
            if (com.minecolonies.coremod.colony.ColonyManager.backupColonyData()) {
                sender.sendMessage(new net.minecraft.util.text.TextComponentString(com.minecolonies.coremod.commands.generalcommands.BackupCommand.BACKUP_SUCCESS_MESSAGE));
            }else {
                sender.sendMessage(new net.minecraft.util.text.TextComponentString(com.minecolonies.coremod.commands.generalcommands.BackupCommand.BACKUP_FAILURE_MESSAGE));
            }
        });
    }else {
        sender.sendMessage(new net.minecraft.util.text.TextComponentString(com.minecolonies.coremod.commands.generalcommands.BackupCommand.NO_PERMISSION_MESSAGE));
    }
}