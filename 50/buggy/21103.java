public T emptyErrorResponse() {
    T msg = errorResponse();
    return ((T) (msg.clear()));
}