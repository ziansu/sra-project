@java.lang.Override
public java.util.List<java.lang.String> addTabCompletionOptions(net.minecraft.command.ICommandSender sender, java.lang.String[] args, net.minecraft.util.BlockPos pos) {
    return command.getCompletion(server, sender, java.util.Arrays.asList(args));
}