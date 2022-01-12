@java.lang.Override
public void onClick(android.view.View v) {
    if ((mSelectedPosition) != (-1)) {
        getChildAt(mSelectedPosition).setSelected(false);
        getChildAt(potsition).setSelected(true);
    }
    mSelectedPosition = potsition;
    if ((onItemClickListener) != null) {
        onItemClickListener.onItemClick(view, potsition, bean);
    }
}