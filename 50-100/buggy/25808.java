public boolean sendMessage(java.lang.String message) {
    if (message == null) {
        return false;
    }
    try {
        _lockObject.lock();
        _socketStreamWriter.write(message, 0, message.length());
        _socketStreamWriter.flush();
    } catch (java.io.IOException e) {
        return false;
    } finally {
        _lockObject.unlock();
    }
    return true;
}