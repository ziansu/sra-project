public void removeSeries(int position) {
    seriesList.remove(position);
    notifyItemRemoved(position);
    ((es.coru.andiag.seriesbook.fragments.SeriesListFragment) (fragment)).notifyItemRemoved(position);
}