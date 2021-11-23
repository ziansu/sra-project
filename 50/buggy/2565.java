@java.lang.Override
public void destroy() {
    super.destroy();
    if (mSubscriptions2Destroy.hasSubscriptions()) {
        mSubscriptions2Destroy.unsubscribe();
    }
    mSubscriptions2Detach = null;
    mSubscriptions2Destroy = null;
}