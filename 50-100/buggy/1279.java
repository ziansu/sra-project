public void disconnect() {
    if (!(isInitialized)) {
        return ;
    }
    try {
        cdoView.close();
        de.cooperateproject.cdo.util.connection.CDOConnectionManager.getInstance().releaseSession(cdoSession);
        unsubscribe();
        topicSession.close();
        de.cooperateproject.ui.focus.connection.SubscriberManager.instance = null;
    } catch (javax.jms.JMSException e) {
        de.cooperateproject.ui.focus.connection.SubscriberManager.logger.error("Couldn't close the topicSession.", e);
    }
}