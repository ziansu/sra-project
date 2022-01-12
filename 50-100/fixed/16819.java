@java.lang.Override
public void onClick(android.view.View v) {
    int position = mHolder.getAdapterPosition();
    if (position == (expandedTripPosition)) {
        expandedTripPosition = -1;
        notifyItemChanged(position);
    }else {
        if ((expandedTripPosition) > (-1)) {
            int lastExpandedPosition = expandedTripPosition;
            notifyItemChanged(lastExpandedPosition);
        }
        expandedTripPosition = position;
        notifyItemChanged(expandedTripPosition);
    }
}