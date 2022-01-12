@java.lang.Override
public int getItemViewType(int position) {
    if ((position == 0) && (useHeader())) {
        return com.mateoj.awesomerecyclerview.HeaderRecyclerViewAdapter.TYPE_HEADER;
    }
    if ((position == (getBasicItemCount())) && (useFooter())) {
        return com.mateoj.awesomerecyclerview.HeaderRecyclerViewAdapter.TYPE_FOOTER;
    }
    return getBasicItemType((position - (useHeader() ? 1 : 0)));
}