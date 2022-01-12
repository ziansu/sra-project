@java.lang.Override
protected void onStart() {
    super.onStart();
    checkCompsToSave();
    getNotificaitons();
    listAdapter.notifyDataSetChanged();
    if ((cb.getCurrentBids().size()) == 0) {
        android.widget.Toast msg = android.widget.Toast.makeText(getApplicationContext(), "No bids on your computers", Toast.LENGTH_SHORT);
        msg.show();
    }
}