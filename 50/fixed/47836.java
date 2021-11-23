@java.lang.Override
public synchronized void stopScanImpl() {
    if ((mState) != (org.physical_web.physicalweb.MdnsPwoDiscoverer.State.STARTED)) {
        return ;
    }
    mState = org.physical_web.physicalweb.MdnsPwoDiscoverer.State.WAITING;
    mNsdManager.stopServiceDiscovery(mDiscoveryListener);
}