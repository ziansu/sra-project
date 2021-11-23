@java.lang.Override
public void onViewDetachedFromWindow(com.github.yasevich.endlessrecyclerview.ViewHolder holder) {
    if (!(progressViewHolders.contains(holder))) {
        adapter.onViewDetachedFromWindow(holder);
    }
}