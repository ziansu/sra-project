@android.databinding.BindingAdapter(value = "items")
public static void setSimilarSeries(android.support.v7.widget.RecyclerView recyclerView, android.databinding.ObservableArrayList<nmct.jaspernielsmichielhein.watchfriends.model.Series> similarSeries) {
    if (similarSeries != null) {
        nmct.jaspernielsmichielhein.watchfriends.adapter.SeriesAdapter seriesAdapter = new nmct.jaspernielsmichielhein.watchfriends.adapter.SeriesAdapter(recyclerView.getContext(), similarSeries);
        recyclerView.setAdapter(seriesAdapter);
        seriesAdapter.notifyDataSetChanged();
    }
}