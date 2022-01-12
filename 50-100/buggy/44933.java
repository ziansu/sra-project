@java.lang.Override
public void onBindViewHolder(net.sxkeji.shixinandroiddemo2.adapter.BaseViewHolder holder, final int position) {
    convert(holder, mData.get(position));
    if ((onRecyclerViewItemClickListener) != null) {
        holder.getView().setOnClickListener(new android.view.View.OnClickListener() {
            @java.lang.Override
            public void onClick(android.view.View v) {
                onRecyclerViewItemClickListener.onItemClick(v, position);
            }
        });
    }
}