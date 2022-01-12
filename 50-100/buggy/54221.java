@java.lang.Override
public void setAutoCommit(boolean autoCommit, io.apiman.gateway.engine.async.IAsyncResultHandler<java.lang.Void> handler) {
    try {
        connection.setAutoCommit(autoCommit);
        handler.handle(io.apiman.gateway.engine.async.AsyncResultImpl.create(null));
    } catch (java.sql.SQLException e) {
        handler.handle(io.apiman.gateway.engine.async.AsyncResultImpl.create(e, java.lang.Void.class));
    }
}