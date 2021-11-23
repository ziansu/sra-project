@java.lang.Override
public void updateSubscriptions(java.lang.String clientID, java.util.Set<org.eclipse.moquette.spi.impl.subscriptions.Subscription> subscriptions) {
    m_persistentSubscriptions.put(clientID, subscriptions);
    m_db.commit();
}