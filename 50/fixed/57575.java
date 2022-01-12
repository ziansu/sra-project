@java.lang.Override
public boolean isActiveEvenInBackground(java.lang.String pkgName) {
    boolean result = false;
    synchronized(mBgActiveApps) {
        result = mBgActiveApps.contains(pkgName);
    }
    return result;
}