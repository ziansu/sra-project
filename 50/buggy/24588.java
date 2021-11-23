private void refreshList() {
    final ru.elegion.weathercaster_mark_one.ui.activities.CityListActivity.UpdateCitiesTask refreshCitiesTask = new ru.elegion.weathercaster_mark_one.ui.activities.CityListActivity.UpdateCitiesTask();
    refreshCitiesTask.execute(mCityLab.getCities());
    mAdapter.notifyDataSetChanged();
    mSwipeRefreshLayout.setRefreshing(false);
}