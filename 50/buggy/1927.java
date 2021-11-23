@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    android.util.Log.d("index value", java.lang.String.valueOf(i));
    listView.setFastScrollEnabled(true);
}