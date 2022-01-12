public void log(java.lang.Object message) throws com.acme.edu.exceptions.LoggerException {
    logWithCurrentLogger(setCurrentLogger(message));
}