@java.lang.Override
public int getSpanSize(int position) {
    if (((isHeader(position)) || (isFooter(position))) || (isLoadMore(position))) {
        return gridLayoutManager.getSpanCount();
    }
    if (spanSizeLookup != null) {
        return spanSizeLookup.getSpanSize(position);
    }
    return 1;
}