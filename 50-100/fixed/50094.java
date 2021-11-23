private void refreshRecyclerViewForDate(@android.support.annotation.NonNull
java.util.Date date) {
    expensesViewAdapter.setDate(date, db);
    if (db.hasExpensesForDay(date)) {
        recyclerView.setVisibility(View.VISIBLE);
        recyclerViewPlaceholder.setVisibility(View.GONE);
    }else {
        recyclerView.setVisibility(View.GONE);
        recyclerViewPlaceholder.setVisibility(View.VISIBLE);
    }
}