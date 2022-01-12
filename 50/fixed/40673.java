@java.lang.Override
public boolean onLongClick(android.view.View v) {
    if ((mListener) != null) {
        mListener.onListFragmentLongInteraction(holder.mItem);
    }
    return true;
}