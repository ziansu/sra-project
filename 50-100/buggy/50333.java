public <A, R> com.torodb.mongowp.Status<R> execute(com.torodb.mongowp.commands.Request request, com.torodb.mongowp.commands.Command<? super A, ? super R> command, A arg) {
    com.google.common.base.Preconditions.checkState(schemaOperationExecutor.isClosed(), "This executor is closed");
    return commandsExecutor.execute(request, command, arg, schemaOperationExecutor);
}