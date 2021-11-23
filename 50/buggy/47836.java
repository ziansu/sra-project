@java.lang.Override
public synchronized void stopScanImpl() {
    if ((mState) != (org.physical_web.physicalweb.MdnsPwoDiscoverer.State.STARTED)) {
        return ;
    }
    mNsdManager.stopServiceDiscovery(mDiscoveryListener);
    mState = org.physical_web.physicalweb.MdnsPwoDiscoverer.State.WAITING;
}