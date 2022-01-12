@java.lang.Override
public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder holder, int position) {
    if ((!(controllerLinks.isLoading())) && (position > ((controllerLinks.size()) - 10))) {
        controllerLinks.loadMoreLinks();
    }
    final com.winsonchiu.reader.AdapterLinkList.ViewHolder viewHolder = ((com.winsonchiu.reader.AdapterLinkList.ViewHolder) (holder));
    viewHolder.onBind(position);
}