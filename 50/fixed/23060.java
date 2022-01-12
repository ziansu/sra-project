@java.lang.Override
public void onItemRangeChanged(int positionStart, int itemCount, java.lang.Object payload) {
    if ((adapter) != null)
        adapter.notifyItemRangeChanged(positionStart, itemCount, payload);
    
}