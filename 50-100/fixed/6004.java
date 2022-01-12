public void checkAndForceLoginIfNecessary() throws com.silicolife.textmining.core.interfaces.core.dataaccess.exception.DaemonException {
    java.util.Date now = new java.util.Date();
    java.util.Date interationServer = webClient.getLastOperationTime();
    long duration = (now.getTime()) - (interationServer.getTime());
    long diffInMinutes = java.util.concurrent.TimeUnit.MILLISECONDS.toMinutes(duration);
    if (diffInMinutes >= (com.silicolife.textmining.core.datastructures.dataaccess.daemon.webserviceclient.RestClient.sessiontimeout)) {
        try {
            com.silicolife.textmining.core.datastructures.dataaccess.daemon.implementation.DataAccessForceLogin.forceLogin();
        } catch (com.silicolife.textmining.core.datastructures.dataaccess.database.dataaccess.implementation.exceptions.CredentialsAccessException e) {
            throw new com.silicolife.textmining.core.interfaces.core.dataaccess.exception.DaemonException(e);
        }
    }
}