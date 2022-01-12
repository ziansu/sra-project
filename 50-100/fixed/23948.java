@java.lang.Override
public void close(io.apiman.gateway.engine.async.IAsyncResultHandler<java.lang.Void> handler) {
    try {
        connection.close();
        handler.handle(io.apiman.gateway.engine.async.AsyncResultImpl.create(((java.lang.Void) (null))));
    } catch (java.sql.SQLException e) {
        handler.handle(io.apiman.gateway.engine.async.AsyncResultImpl.create(e, java.lang.Void.class));
    }
}