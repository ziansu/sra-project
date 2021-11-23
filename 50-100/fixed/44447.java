@java.lang.Override
public int getSpanSize(int position) {
    int viewType = adapterWrapper.getItemViewType(position);
    java.lang.Integer span = typeToSpan.get(viewType);
    if (span != null)
        return span;
    
    com.koushikdutta.boilerplate.recyclerview.ViewHolder vh = adapterWrapper.createViewHolder(this, viewType);
    int foundSpan;
    if (vh instanceof com.koushikdutta.boilerplate.recyclerview.GridRecyclerView.SpanningViewHolder)
        foundSpan = ((com.koushikdutta.boilerplate.recyclerview.GridRecyclerView.SpanningViewHolder) (vh)).getSpanSize(gridLayoutManager.getSpanCount());
    else
        foundSpan = 1;
    
    typeToSpan.put(viewType, foundSpan);
    return foundSpan;
}