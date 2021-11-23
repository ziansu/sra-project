@java.lang.Override
protected void onStart() {
    super.onStart();
    com.example.hugh.countbook.AppStorage.loadFromFile(counterItems, this.getApplicationContext());
    adapter = new com.example.hugh.countbook.MainActivity.CounterListAdapter();
    counterListView.setAdapter(adapter);
}