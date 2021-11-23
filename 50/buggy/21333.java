public void log(java.lang.Object message) throws com.acme.edu.exceptions.LoggerException {
    setCurrentLogger(message);
    logWithCurrentLogger(message);
}