@java.lang.Override
public martell.com.vice.ArticleAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    context = parent.getContext();
    android.view.LayoutInflater inflater = android.view.LayoutInflater.from(context);
    config = new com.nostra13.universalimageloader.core.ImageLoaderConfiguration.Builder(parent.getContext()).build();
    android.view.View articleView = inflater.inflate(R.layout.recycler_item, parent, false);
    martell.com.vice.ArticleAdapter.ViewHolder viewHolder = new martell.com.vice.ArticleAdapter.ViewHolder(articleView);
    android.util.Log.d(martell.com.vice.ArticleAdapter.TAG, "onCreateViewHolder: ");
    return viewHolder;
}