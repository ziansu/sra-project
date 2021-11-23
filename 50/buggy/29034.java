@java.lang.Override
public void fail(@javax.annotation.Nonnull
java.lang.Throwable throwable) {
    io.crate.protocols.postgres.Messages.sendErrorResponse(channel, io.crate.exceptions.Exceptions.messageOf(throwable));
    listener.onFailure(throwable);
}