@java.lang.Override
public void onSetSwipeBackground(com.h6ah4i.android.example.advrecyclerview.demo_ds_selection.MyDraggableSwipeableSelectableItemAdapter.MyViewHolder holder, int position, int type) {
    int bgRes = 0;
    switch (type) {
        case com.h6ah4i.android.widget.advrecyclerview.swipeable.RecyclerViewSwipeManager.DRAWABLE_SWIPE_NEUTRAL_BACKGROUND :
            bgRes = R.drawable.bg_swipe_item_neutral;
            break;
        case com.h6ah4i.android.widget.advrecyclerview.swipeable.RecyclerViewSwipeManager.DRAWABLE_SWIPE_LEFT_BACKGROUND :
            bgRes = R.drawable.bg_swipe_item_left;
            break;
        case com.h6ah4i.android.widget.advrecyclerview.swipeable.RecyclerViewSwipeManager.DRAWABLE_SWIPE_RIGHT_BACKGROUND :
            bgRes = R.drawable.bg_swipe_item_right;
            break;
    }
    holder.itemView.setBackgroundResource(bgRes);
}