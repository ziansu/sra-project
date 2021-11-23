@java.lang.Override
public void onClick(android.view.View v) {
    if ((mSelectedPosition) != (-1)) {
        getChildAt(mSelectedPosition).setSelected(false);
        getChildAt(position).setSelected(true);
    }
    mSelectedPosition = position;
    if ((onItemClickListener) != null) {
        onItemClickListener.onItemClick(view, position, bean);
    }
}