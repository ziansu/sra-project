@java.lang.Override
public void gpsCallback() {
    if ((GlobalVariables.ALL_EVENTS_DATA.size()) > 0) {
        com.example.FundigoApp.Customer.RealTime.RealTimeActivity.events_sorted_by_dist_data.clear();
        com.example.FundigoApp.Customer.RealTime.RealTimeActivity.events_sorted_by_dist_data = getSortedListByDist();
        java.util.List<com.example.FundigoApp.Events.EventInfo> tempFilteredList = com.example.FundigoApp.StaticMethod.FilterMethods.filterByFilterName(GlobalVariables.CURRENT_FILTER_NAME, GlobalVariables.CURRENT_SUB_FILTER, GlobalVariables.CURRENT_DATE_FILTER, GlobalVariables.CURRENT_PRICE_FILTER, com.example.FundigoApp.Customer.RealTime.RealTimeActivity.events_sorted_by_dist_data);
        com.example.FundigoApp.Customer.RealTime.RealTimeActivity.events_data_filtered.clear();
        com.example.FundigoApp.Customer.RealTime.RealTimeActivity.events_data_filtered.addAll(tempFilteredList);
        eventsGridAdapter.notifyDataSetChanged();
    }
    turnOnGPS.setVisibility(View.GONE);
}