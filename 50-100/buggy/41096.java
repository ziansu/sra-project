@java.lang.Override
public void onItemClick(com.mcochin.stockstreaks.adapters.MainAdapter.MainViewHolder holder) {
    int position = holder.getAdapterPosition();
    if (position != (android.support.v7.widget.RecyclerView.NO_POSITION)) {
        java.lang.String symbol = getListManipulator().getItem(position).getSymbol();
        android.net.Uri detailUri = com.mcochin.stockstreaks.data.StockContract.StockEntry.buildUri(symbol);
        if ((mDetailContainer) != null) {
            insertFragmentIntoDetailContainer(detailUri);
        }else {
            insertFragmentIntoDetailActivity(detailUri);
        }
    }
}