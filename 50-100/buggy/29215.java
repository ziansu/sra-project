@java.lang.Override
public int getItemViewType(int position) {
    if ((position == 0) && (useHeader())) {
        return com.mateoj.awesomerecyclerview.HeaderRecyclerViewAdapter.TYPE_HEADER;
    }
    if ((position == (getBasicItemCount())) && (useFooter())) {
        return com.mateoj.awesomerecyclerview.HeaderRecyclerViewAdapter.TYPE_FOOTER;
    }
    if ((getBasicItemType(position)) >= ((java.lang.Integer.MAX_VALUE) - (com.mateoj.awesomerecyclerview.HeaderRecyclerViewAdapter.TYPE_ADAPTEE_OFFSET))) {
        new java.lang.IllegalStateException((("HeaderRecyclerViewAdapter offsets your BasicItemType by " + (com.mateoj.awesomerecyclerview.HeaderRecyclerViewAdapter.TYPE_ADAPTEE_OFFSET)) + "."));
    }
    return (getBasicItemType(position)) + (com.mateoj.awesomerecyclerview.HeaderRecyclerViewAdapter.TYPE_ADAPTEE_OFFSET);
}