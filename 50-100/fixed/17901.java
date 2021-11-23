@java.lang.Override
public void onClick(android.view.View view) {
    int oldPosition = selectedPosition;
    selectedPosition = getLayoutPosition();
    boolean selected = oldPosition != (selectedPosition);
    if (selected) {
        notifyItemChanged(oldPosition);
    }else {
        selectedPosition = -1;
    }
    notifyItemChanged(getLayoutPosition());
    onClickListener.onItemClicked(contacts.get(getLayoutPosition()), selected);
}