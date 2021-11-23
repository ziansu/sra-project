@java.lang.Override
public android.view.View findSnapView(android.support.v7.widget.RecyclerView.LayoutManager layoutManager) {
    if (layoutManager instanceof android.support.v7.widget.LinearLayoutManager) {
        switch (mGravity) {
            case android.view.Gravity.START :
                return findStartView(layoutManager, getHorizontalHelper(layoutManager));
            case android.view.Gravity.END :
                return findEndView(layoutManager, getHorizontalHelper(layoutManager));
            case android.view.Gravity.TOP :
                return findStartView(layoutManager, getVerticalHelper(layoutManager));
            case android.view.Gravity.BOTTOM :
                return findEndView(layoutManager, getVerticalHelper(layoutManager));
        }
    }
    return null;
}