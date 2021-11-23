@java.lang.Override
@java.lang.SuppressWarnings(value = "unchecked")
public java.util.List<java.lang.String> addTabCompletionOptions(net.minecraft.command.ICommandSender sender, java.lang.String[] args, net.minecraft.util.BlockPos pos) {
    return command.getCompletion(server, sender, scala.actors.threadpool.Arrays.asList(args));
}