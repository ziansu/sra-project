public void addStatusFilter(int statusFilter) {
    android.util.Log.d("FoodItemAdapter", ("adding status filter = " + (com.mfranklin.fridgeapp.data_model.Constants.statusToString(statusFilter))));
    statusFilters.add(statusFilter);
}