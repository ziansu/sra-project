int getInternalItemViewType(int position) {
    int viewType;
    if (position < (getHeadersCount())) {
        viewType = position;
    }else
        if (position >= (getFooterStartIndex())) {
            viewType = (((position - (getFooterStartIndex())) + (getHeadersCount())) + (getItemViewTypeCount())) - 1;
        }else {
            viewType = (getItemViewType((position - (getHeadersCount())))) + (getHeadersCount());
        }
    
    return viewType;
}