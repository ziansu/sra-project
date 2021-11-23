@java.lang.Override
public void onServiceResolved(android.net.nsd.NsdServiceInfo serviceInfo) {
    android.util.Log.e(moe.retro.unijoysticle.BaseActivity.TAG, ("Resolve Succeeded. " + serviceInfo));
    mServerInetAddress = serviceInfo.getHost();
    mFinishedResolve = true;
}