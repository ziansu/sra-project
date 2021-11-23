@java.lang.Override
public void filter(@android.support.annotation.Nullable
java.lang.String filter) {
    if ((adapter) != null) {
        this.filter = filter;
        adapter.filter(filter);
    }
}