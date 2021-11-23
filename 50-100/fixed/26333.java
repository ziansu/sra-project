@java.lang.Override
public <T extends com.amazon.infra.commandbus.Command<R>, R> com.amazon.infra.commandbus.CommandResult<R> submit(T command) throws com.amazon.infra.commandbus.CommandBusException {
    java.lang.String id = send(command);
    com.amazon.infra.commandbus.CommandResult<R> commandResult = new com.amazon.infra.commandbus.CommandResult<R>(this, executionService, id, command.getReturnType());
    return commandResult;
}