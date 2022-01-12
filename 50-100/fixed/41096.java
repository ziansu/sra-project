@java.lang.Override
public void onItemClick(com.mcochin.stockstreaks.adapters.MainAdapter.MainViewHolder holder) {
    int position = holder.getAdapterPosition();
    if (position != (android.support.v7.widget.RecyclerView.NO_POSITION)) {
        java.lang.String symbol = getListManipulator().getItem(position).getSymbol();
        if ((mDetailContainer) != null) {
            insertFragmentIntoDetailContainer(symbol);
        }else {
            insertFragmentIntoDetailActivity(symbol);
        }
    }
}