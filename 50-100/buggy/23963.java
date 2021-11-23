private synchronized void validateFile() throws org.hornetq.api.core.HornetQException {
    try {
        if ((file) == null) {
            if ((messageID) <= 0) {
                throw new java.lang.RuntimeException("MessageID not set on LargeMessage");
            }
            file = createFile();
            openFile();
            bodySize = file.size();
        }
    } catch (java.lang.Exception e) {
        throw new org.hornetq.api.core.HornetQInternalErrorException(e.getMessage(), e);
    }
}