@java.lang.Override
public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder holder, int position) {
    if (holder instanceof com.forezp.banya.adapter.MusicAdapter.FooterViewHolder) {
        com.forezp.banya.adapter.MusicAdapter.FooterViewHolder footerViewHolder = ((com.forezp.banya.adapter.MusicAdapter.FooterViewHolder) (holder));
        footerViewHolder.bindItem();
    }else
        if (holder instanceof com.forezp.banya.adapter.MusicAdapter.MusicViewHolder) {
            com.forezp.banya.adapter.MusicAdapter.MusicViewHolder musicViewHolder = ((com.forezp.banya.adapter.MusicAdapter.MusicViewHolder) (holder));
            if ((list.size()) > 0) {
                musicViewHolder.bindItem(list.get(position), position);
            }
        }
    
}