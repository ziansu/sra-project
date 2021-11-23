@java.lang.Override
public void onClick(android.view.View v) {
    if ((mListener) != null) {
        mListener.onListFragmentInteraction(holder.mItem);
    }
}