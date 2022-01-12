@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    dayAdapter = new org.buildmlearn.mconference.adapters.DayRecyclerView(talks);
    dayRecyclerView.setAdapter(dayAdapter);
}