public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int pos, long id) {
    currentSchedule = adapter3.getItem(pos);
    android.widget.Toast.makeText(context, currentSchedule.getStart_hour(), Toast.LENGTH_SHORT).show();
}