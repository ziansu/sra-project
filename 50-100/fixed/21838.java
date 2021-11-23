@java.lang.Override
public com.example.andrew.prokhor.eyecare.ui.adapters.ExpandableCursorRecyclerViewAdapter.MyParentViewHolder onCreateParentViewHolder(android.view.ViewGroup parentViewGroup) {
    android.util.Log.d(com.example.andrew.prokhor.eyecare.ui.adapters.ExpandableCursorRecyclerViewAdapter.LOG_TAG, "onCreateParentViewHolder()");
    android.view.View view = android.view.LayoutInflater.from(parentViewGroup.getContext()).inflate(R.layout.item_logs_parent, parentViewGroup, false);
    return new com.example.andrew.prokhor.eyecare.ui.adapters.ExpandableCursorRecyclerViewAdapter.MyParentViewHolder(mContext, view);
}