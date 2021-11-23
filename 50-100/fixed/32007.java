public void updateCountersNumber() {
    numCounters = counterList.size();
    numCounterText.setText(java.lang.String.valueOf(numCounters));
    adapter = new com.example.arankin.arankin_countbook.CounterLayoutAdapter(counterList, this, this);
    recyclerView.setAdapter(adapter);
    adapter.notifyDataSetChanged();
    saveToFile();
}