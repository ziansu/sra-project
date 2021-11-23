@java.lang.Override
public void onClick(android.view.View v) {
    if ((mHolder.getAdapterPosition()) == (expandedTripPosition)) {
        expandedTripPosition = -1;
        notifyItemChanged(mHolder.getAdapterPosition());
    }else {
        if ((expandedTripPosition) > (-1)) {
            int lastExpandedPosition = expandedTripPosition;
            notifyItemChanged(lastExpandedPosition);
        }
        expandedTripPosition = mHolder.getAdapterPosition();
        notifyItemChanged(expandedTripPosition);
    }
}