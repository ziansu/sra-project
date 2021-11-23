private void refreshRecyclerViewForDate(@android.support.annotation.NonNull
java.util.Date date) {
    if (db.hasExpensesForDay(date)) {
        expensesViewAdapter.setDate(date, db);
        recyclerView.setVisibility(View.VISIBLE);
        recyclerViewPlaceholder.setVisibility(View.GONE);
    }else {
        recyclerView.setVisibility(View.GONE);
        recyclerViewPlaceholder.setVisibility(View.VISIBLE);
    }
}