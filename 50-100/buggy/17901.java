@java.lang.Override
public void onClick(android.view.View view) {
    int oldPosition = selectedPosition;
    selectedPosition = getLayoutPosition();
    boolean selected = oldPosition != (selectedPosition);
    notifyItemChanged(selectedPosition);
    if (selected)
        notifyItemChanged(oldPosition);
    
    onClickListener.onItemClicked(contacts.get(getLayoutPosition()), selected);
}