@java.lang.Override
public void onSelectedChanged(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int actionState) {
    if (actionState != (android.support.v7.widget.helper.ItemTouchHelper.ACTION_STATE_IDLE)) {
        if (viewHolder instanceof com.tobiadeyinka.me.android.utilities.list_adapter_utils.helpers.ItemTouchHelperViewHolder) {
            com.tobiadeyinka.me.android.utilities.list_adapter_utils.helpers.ItemTouchHelperViewHolder itemViewHolder = ((com.tobiadeyinka.me.android.utilities.list_adapter_utils.helpers.ItemTouchHelperViewHolder) (viewHolder));
            itemViewHolder.onItemSelected();
        }
    }
    super.onSelectedChanged(viewHolder, actionState);
}