@java.lang.Override
protected void onPostExecute(java.util.ArrayList<com.example.c4q_ac35.justmygoogle.SportsFeed> sportsFeedsArrayList) {
    android.widget.ArrayAdapter<com.example.c4q_ac35.justmygoogle.SportsFeed> sportsAdapter = new android.widget.ArrayAdapter<com.example.c4q_ac35.justmygoogle.SportsFeed>(this, R.layout.list_item2, sportsFeedsArrayList);
    sportsFeedListView.setAdapter(sportsAdapter);
}