@java.lang.Override
public Message.Request request() {
    com.datastax.driver.core.Message.Request request = callback.request();
    if (((retryConsistencyLevel) != null) && ((retryConsistencyLevel) != (request.consistency())))
        request = manager.makeRequestMessage(statement, retryConsistencyLevel, request.consistency(), request.pagingState());
    
    return request;
}