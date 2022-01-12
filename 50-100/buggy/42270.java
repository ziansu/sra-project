@java.lang.Override
public void onClick(android.view.View v) {
    if (mEditable) {
        int pos = getAdapterPosition();
        if ((pos > 0) && (pos < (mPlayers.size()))) {
            mPlayers.remove(pos);
            notifyItemRemoved(pos);
        }
    }
}