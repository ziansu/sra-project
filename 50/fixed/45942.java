@java.lang.Override
public final void onItemDismissed(T item, int position) {
    remove(item);
    mBinder.onItemDismiss(item, position);
}