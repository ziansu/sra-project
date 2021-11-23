@java.lang.Override
public RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.support.v7.widget.RecyclerView.ViewHolder viewHolder;
    android.view.LayoutInflater inflater = android.view.LayoutInflater.from(parent.getContext());
    android.view.View view = inflater.inflate(R.layout.photos_grid_element_layout, parent, false);
    viewHolder = new io.github.krtkush.marsexplorer.RoverExplorer.PhotosRecyclerViewAdapter.PhotosViewHolder(view);
    return viewHolder;
}