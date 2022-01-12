@java.lang.Override
public void prepare(net.bpiwowar.xpm.commands.CommandContext environment) throws java.io.IOException {
    command.prepare(environment);
    final java.nio.file.Path file = environment.getUniqueFile("command", ".pipe");
    final java.lang.Object o = environment.setData(this, file);
    if (o != null)
        throw new java.lang.RuntimeException("CommandOutput data should be null");
    
    environment.getNamedRedirections(command, true).outputRedirections.add(file);
    environment.detached(command, true);
}