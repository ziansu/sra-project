private void showFavourites() {
    atHome = true;
    title.setText(R.string.title_favourites);
    adapter.reset();
    adapter.addFragment(new org.hawkular.client.android.fragment.FavMetricsFragment(), "Metrics");
    adapter.addFragment(new org.hawkular.client.android.fragment.FavTriggersFragment(), "Triggers");
    adapter.notifyDataSetChanged();
}