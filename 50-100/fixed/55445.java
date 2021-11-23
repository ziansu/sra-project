@java.lang.Override
public void onBindViewHolder(com.example.ipodkhodov.netflixtestapplication.MainActivityFragment.MyAdapter.ViewHolder holder, int position) {
    java.lang.String url = dataset.get(position).url;
    holder.url = url;
    if (bitmapCache.containsKey(url)) {
        holder.image.setImageBitmap(bitmapCache.get(url));
    }else {
        holder.image.setImageResource(R.drawable.loading);
        scheduleDownload(holder);
    }
    if (position == ((dataset.size()) - 1)) {
        loadNextPage();
    }
}