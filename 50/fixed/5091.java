@java.lang.Override
public int getItemViewType(int position) {
    if (isPositionHeader(position)) {
        return com.chaemil.hgms.adapter.DownloadsAdapter.TYPE_HEADER;
    }
    return com.chaemil.hgms.adapter.DownloadsAdapter.TYPE_ITEM;
}