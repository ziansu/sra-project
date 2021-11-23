@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    this.onItemClick(i);
    listener.onItemClick(adapterView, view, i, l);
}