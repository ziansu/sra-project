@java.lang.Override
public com.chenenyu.router.IRouter with(android.os.Bundle bundle) {
    if ((bundle != null) && (!(bundle.isEmpty()))) {
        android.os.Bundle allBundle = mRouteRequest.getExtras();
        if (allBundle == null) {
            allBundle = new android.os.Bundle();
        }
        allBundle.putAll(bundle);
        mRouteRequest.setExtras(allBundle);
    }
    return this;
}