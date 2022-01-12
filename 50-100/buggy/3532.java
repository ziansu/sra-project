@java.lang.Override
public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, final int i) {
    if ((i != 0) && ((mHeader) != null)) {
        onBindViewHolderImpl(viewHolder, this, (i - 1));
    }else
        if (i != 0) {
            onBindViewHolderImpl(viewHolder, this, i);
        }
    
}