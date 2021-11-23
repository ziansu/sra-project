public void onClick(android.view.View V) {
    saveData();
    android.content.Intent intent = new android.content.Intent(this, com.example.levinm.bcreaderv3.historyactivity.class);
    intent.putStringArrayListExtra("key", historyitems);
    startActivity(intent);
}