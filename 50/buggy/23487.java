@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    android.util.Log.d("jai done Thread", "populateFragment");
    dayAdapter = new org.buildmlearn.mconference.adapters.DayRecyclerView(talks);
    dayRecyclerView.setAdapter(dayAdapter);
}