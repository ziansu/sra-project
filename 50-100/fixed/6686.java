protected android.os.Bundle createTransportOptionsBundle(android.util.Pair[] sharedViews) {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) {
        if (sharedViews != null) {
            java.util.ArrayList<android.util.Pair> sharedViewList = extendsSharedViewsForTransport(new java.util.ArrayList(java.util.Arrays.asList(sharedViews)));
            sharedViews = new android.util.Pair[sharedViewList.size()];
            sharedViewList.toArray(sharedViews);
            return android.app.ActivityOptions.makeSceneTransitionAnimation(this, sharedViews).toBundle();
        }
    }
    return null;
}