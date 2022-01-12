@java.lang.Override
public com.annadalnoki.androidtest.adapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.content.Context context = parent.getContext();
    android.view.LayoutInflater inflater = android.view.LayoutInflater.from(context);
    android.view.View movieList = inflater.inflate(R.layout.movie_card, parent, false);
    com.annadalnoki.androidtest.adapter.ViewHolder viewHolder = new com.annadalnoki.androidtest.adapter.ViewHolder(movieList);
    loadGenres();
    return viewHolder;
}