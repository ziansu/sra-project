@java.lang.Override
protected void onStart() {
    super.onStart();
    moodListForDay = new java.util.ArrayList<>();
    moodListForMonth = new java.util.ArrayList<>();
    loadFromFile();
    moodArrayAdapter = new com.example.austin.inthemood.MoodAdapter(this, moodListForDay, controller.getCurrentUser().getName());
    moodForDayListView.setAdapter(moodArrayAdapter);
    moodArrayAdapter.notifyDataSetChanged();
    user = controller.getCurrentUser();
}