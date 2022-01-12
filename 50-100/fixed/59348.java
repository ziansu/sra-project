public act.cli.CliDispatcher registerCommandHandler(java.lang.String command, act.cli.meta.CommandMethodMetaInfo methodMetaInfo, act.cli.meta.CommanderClassMetaInfo classMetaInfo) {
    if (registry.containsKey(command)) {
        throw org.osgl.util.E.invalidConfiguration("Command %s already registered", command);
    }
    addToRegistry(command, new act.handler.builtin.cli.CliHandlerProxy(classMetaInfo, methodMetaInfo, app()));
    act.cli.CliDispatcher.logger.info("Command registered: %s", command);
    return this;
}