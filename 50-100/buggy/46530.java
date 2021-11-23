@java.lang.Override
public void commit(io.apiman.gateway.engine.async.IAsyncResultHandler<java.lang.Void> handler) {
    try {
        connection.commit();
        handler.handle(io.apiman.gateway.engine.async.AsyncResultImpl.create(null));
    } catch (java.sql.SQLException e) {
        handler.handle(io.apiman.gateway.engine.async.AsyncResultImpl.create(e, java.lang.Void.class));
    }
}