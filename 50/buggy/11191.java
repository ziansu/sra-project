@java.lang.Override
public void onClick(android.view.View v) {
    if (null != (mListener)) {
        mListener.onListFragmentInteraction(holder.mItem);
    }
}