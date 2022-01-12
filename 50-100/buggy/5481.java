@java.lang.Override
public void postSetUp() {
    super.postSetUp();
    if ((net.wequick.small.ApkBundleLauncher.sLoadedApks) == null) {
        android.util.Log.e(net.wequick.small.ApkBundleLauncher.TAG, "Could not find any APK bundles!");
        return ;
    }
    final android.app.Application app = net.wequick.small.Small.getContext();
    mApkLoader.mergeResources();
    mApkLoader.createApplications();
    if ((net.wequick.small.ApkBundleLauncher.mLazyInitProviders) != null) {
        net.wequick.small.ApkBundleLauncher.sActivityThread.installSystemProviders(net.wequick.small.ApkBundleLauncher.mLazyInitProviders);
        net.wequick.small.ApkBundleLauncher.mLazyInitProviders = null;
    }
    net.wequick.small.ApkBundleLauncher.sLoadedApks = null;
    net.wequick.small.ApkBundleLauncher.sProviders = null;
}