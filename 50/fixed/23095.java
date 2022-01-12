@java.lang.Override
public boolean isClosed() {
    if (super.isClosed())
        return true;
    
    final com.orientechnologies.orient.client.remote.OStorageRemoteSession session = getCurrentSession();
    if (session == null)
        return false;
    
    return session.isClosed();
}