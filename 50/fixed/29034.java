@java.lang.Override
public void fail(@javax.annotation.Nonnull
java.lang.Throwable throwable) {
    io.crate.protocols.postgres.Messages.sendErrorResponse(channel, throwable);
    listener.onFailure(throwable);
}