public static android.view.View findParentViewHolderItemView(android.view.View v) {
    final android.view.ViewParent parent = v.getParent();
    if (parent instanceof android.support.v7.widget.RecyclerView) {
        return v;
    }else
        if (v instanceof android.view.View) {
            return com.h6ah4i.android.example.advrecyclerview.common.utils.AdapterUtils.findParentViewHolderItemView(((android.view.View) (parent)));
        }else {
            return null;
        }
    
}