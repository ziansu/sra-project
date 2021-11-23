@java.lang.Override
public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, final int i) {
    if ((mHeader) != null) {
        if (i == 0) {
            return ;
        }
        onBindViewHolderImpl(viewHolder, this, (i - 1));
    }else {
        onBindViewHolderImpl(viewHolder, this, i);
    }
}