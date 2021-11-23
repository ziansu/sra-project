@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<android.database.Cursor> loader, android.database.Cursor data) {
    forecastAdapter.swapCursor(data);
    if ((selectedPosition) != (android.support.v7.widget.RecyclerView.NO_POSITION)) {
        recyclerView.smoothScrollToPosition(selectedPosition);
        android.support.v7.widget.RecyclerView.ViewHolder selectedViewHolder = recyclerView.findViewHolderForAdapterPosition(selectedPosition);
        if ((selectedViewHolder != null) && (selectedViewHolder instanceof com.example.brett.sunshine.ForecastListItemViewHolder)) {
            ((com.example.brett.sunshine.ForecastListItemViewHolder) (selectedViewHolder)).onClick(selectedViewHolder.itemView);
        }
    }
    updateEmptyViewStatusText();
}