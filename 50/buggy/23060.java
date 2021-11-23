@java.lang.Override
public void onItemRangeChanged(int positionStart, int itemCount, java.lang.Object payload) {
    adapter.notifyItemRangeChanged(positionStart, itemCount, payload);
}