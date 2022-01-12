public void onClick(android.view.View view) {
    if ((selected) == null) {
        android.content.Context context = getApplicationContext();
        java.lang.CharSequence text = "Please select a record first.";
        int duration = android.widget.Toast.LENGTH_SHORT;
        android.widget.Toast toast = android.widget.Toast.makeText(context, text, duration);
        toast.show();
    }else {
        adapter.remove(selected);
        saveInFile();
        count.setText(("Number of records = " + (recordList.size())));
        selected = null;
        adapter.notifyDataSetChanged();
    }
}