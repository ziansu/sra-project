@java.lang.Override
public java.lang.String getClusterNameById(final int iClusterId) {
    if (iClusterId < 0)
        return null;
    
    checkIfActive();
    return storage.getPhysicalClusterNameById(iClusterId);
}