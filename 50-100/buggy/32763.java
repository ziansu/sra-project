@java.lang.Override
public android.view.View newView(android.content.Context context, android.database.Cursor cursor, android.view.ViewGroup parent) {
    android.view.View view;
    view = android.view.LayoutInflater.from(context).inflate(R.layout.grid_element, parent, false);
    com.franktan.popularmovies.MovieGridAdapter.ViewHolder viewHolder = new com.franktan.popularmovies.MovieGridAdapter.ViewHolder(view);
    view.setTag(viewHolder);
    bindView(view, context, cursor);
    return view;
}