@java.lang.Override
public android.view.View newView(android.content.Context context, android.database.Cursor cursor, android.view.ViewGroup viewGroup) {
    com.exequiel.redditor.ui.fragment.adapter.SubRedditNameCursorAdapter.ViewHolder viewHolder;
    android.view.View view = android.view.LayoutInflater.from(context).inflate(R.layout.subreddit_name_item, viewGroup, false);
    if (view != null) {
        viewHolder = ((com.exequiel.redditor.ui.fragment.adapter.SubRedditNameCursorAdapter.ViewHolder) (view.getTag()));
    }else {
        viewHolder = new com.exequiel.redditor.ui.fragment.adapter.SubRedditNameCursorAdapter.ViewHolder(view);
        view.setTag(viewHolder);
    }
    return view;
}