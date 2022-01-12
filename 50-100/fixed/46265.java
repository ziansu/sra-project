private static android.support.design.widget.AppBarLayout findFirstAppBarLayout(java.util.List<android.view.View> views) {
    int i = 0;
    for (int z = views.size(); i < z; ++i) {
        android.view.View view = views.get(i);
        if (view instanceof android.support.design.widget.AppBarLayout) {
            return ((android.support.design.widget.AppBarLayout) (view));
        }
    }
    return null;
}