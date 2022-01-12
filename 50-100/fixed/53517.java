@java.lang.Override
public void showMore(@android.support.annotation.Nullable
java.util.List list) {
    int size = mGirls.size();
    for (java.lang.Object girl : list) {
        mGirls.add(((com.hackerli.retrofit.data.entity.Girl) (girl)));
    }
    if ((recyclerView) != null) {
        recyclerView.requestLayout();
    }
    if (((mGirls.size()) - size) == 10) {
        (page)++;
    }
}