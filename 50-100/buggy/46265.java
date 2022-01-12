private static android.support.design.widget.AppBarLayout findFirstAppBarLayout(java.util.List<android.view.View> views) {
    int i = 0;
    for (int z = views.size(); i < z; ++i) {
        android.view.View view = views.get(i);
        if (view instanceof android.support.design.widget.AppBarLayout) {
            android.util.Log.v(com.example.igorklimov.popularmoviesdemo.helpers.FixedScrollingViewBehavior.TAG, "onMeasureChild:4 ");
            return ((android.support.design.widget.AppBarLayout) (view));
        }
    }
    android.util.Log.v(com.example.igorklimov.popularmoviesdemo.helpers.FixedScrollingViewBehavior.TAG, "onMeasureChild:5 ");
    return null;
}