@java.lang.Override
public int onGetSwipeReactionType(com.h6ah4i.android.example.advrecyclerview.demo_ds_selection.MyDraggableSwipeableSelectableItemAdapter.MyViewHolder holder, int position, int x, int y) {
    if (onCheckCanStartDrag(holder, position, x, y)) {
        return com.h6ah4i.android.widget.advrecyclerview.swipeable.RecyclerViewSwipeManager.REACTION_CAN_NOT_SWIPE_BOTH;
    }else {
        return mProvider.getItem(holder.getPosition()).getSwipeReactionType();
    }
}