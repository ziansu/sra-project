public boolean sendMessage(java.lang.String message) {
    boolean result = false;
    try {
        _lockObject.lock();
        if (message != null) {
            _socketStreamWriter.write(message, 0, message.length());
            _socketStreamWriter.flush();
            result = true;
        }
    } catch (java.io.IOException e) {
    } finally {
        _lockObject.unlock();
    }
    return result;
}