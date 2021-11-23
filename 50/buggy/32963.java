@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> arg0, android.view.View arg1, int position, long arg3) {
    intent.putExtra("dayIndex", adapter.getItem(position).toString());
    this.startActivity(intent);
}