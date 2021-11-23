@java.lang.Override
protected void onStart() {
    super.onStart();
    counterItems = com.example.hugh.countbook.AppStorage.loadFromFile(this.getApplicationContext());
    adapter = new com.example.hugh.countbook.MainActivity.CounterListAdapter();
    counterListView.setAdapter(adapter);
}