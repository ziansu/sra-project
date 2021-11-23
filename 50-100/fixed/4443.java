private java.util.List<com.quickblox.sample.groupchatwebrtc.adapters.OpponentsFromCallAdapter.ViewHolder> getAllOpponentsView() {
    if ((viewHolders) != null) {
        return viewHolders;
    }
    int childCount = recyclerView.getChildCount();
    viewHolders = new java.util.ArrayList<>();
    for (int i = 0; i < childCount; i++) {
        android.view.View childView = recyclerView.getChildAt(i);
        com.quickblox.sample.groupchatwebrtc.adapters.OpponentsFromCallAdapter.ViewHolder childViewHolder = ((com.quickblox.sample.groupchatwebrtc.adapters.OpponentsFromCallAdapter.ViewHolder) (recyclerView.getChildViewHolder(childView)));
        viewHolders.add(childViewHolder);
    }
    return viewHolders;
}