@java.lang.Override
public void onItemClick(android.view.View view) {
    int position = mRecyclerView.getChildPosition(view);
    mCallbacks.onItemSelected(java.lang.String.valueOf(position));
}