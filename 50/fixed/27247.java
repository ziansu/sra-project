public void removeSeries(int position) {
    seriesList.remove(position);
    notifyItemRemoved(position);
}