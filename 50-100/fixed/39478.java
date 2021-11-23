protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.history);
    histView = ((android.widget.ListView) (findViewById(R.id.history_file_view)));
    histView.setOnItemClickListener(new android.widget.ListView.OnItemClickListener() {
        public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int pos, long id) {
            returnResults(pos);
        }
    });
    com.majestic.director.adapter.HistoryEntryArrayAdapter adapter = new com.majestic.director.adapter.HistoryEntryArrayAdapter(getApplicationContext(), R.layout.entry, Director.history);
    histView.setAdapter(adapter);
}