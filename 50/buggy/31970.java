public final void remove(@android.support.annotation.NonNull
final T item) {
    mList.remove(item);
    notifyItemRemovedSafe(mList.indexOf(item));
}