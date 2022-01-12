@java.lang.Override
public void onClick(android.view.View v) {
    int clickedPosition = getAdapterPosition();
    if (isSteps) {
        mOnClickListener.onListItemClick(clickedPosition, v);
    }
}