private boolean execute_BUNDLE_CLEAR() {
    int bundleIndex = getBundleArg();
    if (bundleIndex < 0)
        return false;
    
    if (!(checkEOL()))
        return false;
    
    android.os.Bundle b = com.rfo.basic.Run.theBundles.get(bundleIndex);
    b.clear();
    return true;
}