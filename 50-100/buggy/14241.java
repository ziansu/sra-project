@java.lang.Override
@org.jetbrains.annotations.Nullable
public PlayerActionMessage.ResultMessage performPlayerAction(@org.jetbrains.annotations.NotNull
su.iota.backend.messages.game.PlayerActionMessage playerActionMessage) throws co.paralleluniverse.fibers.SuspendExecution, java.lang.InterruptedException {
    if (((signedInUser) == null) || ((gameSession) == null)) {
        return null;
    }
    final su.iota.backend.messages.OutgoingMessage result = gameSession.call(playerActionMessage);
    if (!(result instanceof su.iota.backend.messages.game.PlayerActionMessage.ResultMessage)) {
        throw new java.lang.AssertionError();
    }
    return ((su.iota.backend.messages.game.PlayerActionMessage.ResultMessage) (result));
}