@java.lang.Override
protected void onResume() {
    super.onResume();
    java.util.List<com.example.FundigoApp.Events.EventInfo> tempFilteredList = com.example.FundigoApp.StaticMethod.FilterMethods.filterByFilterName(GlobalVariables.CURRENT_FILTER_NAME, GlobalVariables.CURRENT_SUB_FILTER, GlobalVariables.CURRENT_DATE_FILTER, GlobalVariables.CURRENT_PRICE_FILTER, com.example.FundigoApp.Customer.RealTime.RealTimeActivity.events_sorted_by_dist_data);
    com.example.FundigoApp.Customer.RealTime.RealTimeActivity.events_data_filtered.clear();
    com.example.FundigoApp.Customer.RealTime.RealTimeActivity.events_data_filtered.addAll(tempFilteredList);
    eventsGridAdapter.notifyDataSetChanged();
    displayFilterBanner();
}