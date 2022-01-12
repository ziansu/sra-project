@java.lang.Override
public void onBindViewHolder(final android.support.v7.widget.RecyclerView.ViewHolder holder, final int position) {
    switch (holder.getItemViewType()) {
        case com.mayo.recyclerview.NamesHeaderAdapter.HEADER :
            com.mayo.recyclerview.NamesHeaderAdapter.HeaderHolder headerHolder = ((com.mayo.recyclerview.NamesHeaderAdapter.HeaderHolder) (holder));
            configureHeaderView(headerHolder, position);
            break;
        default :
            com.mayo.recyclerview.NamesHeaderAdapter.ItemHolder itemHolder = ((com.mayo.recyclerview.NamesHeaderAdapter.ItemHolder) (holder));
            configureItemView(itemHolder, position);
            break;
    }
}